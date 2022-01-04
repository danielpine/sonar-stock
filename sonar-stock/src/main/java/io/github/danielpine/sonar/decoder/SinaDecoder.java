package io.github.danielpine.sonar.decoder;

import feign.Response;
import feign.codec.Decoder;
import io.github.danielpine.sonar.pojo.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SinaDecoder implements Decoder {

    Logger logger = LoggerFactory.getLogger(SinaDecoder.class);

    final Decoder delegate;

    public SinaDecoder(Decoder delegate) {
        Objects.requireNonNull(delegate, "Decoder must not be null. ");
        this.delegate = delegate;
    }

    /**
     * @param response
     * @param type
     * @return
     * @throws IOException
     */
    @Override
    public Object decode(Response response, Type type) throws IOException {
        Object delegateResponse = delegate.decode(response, type);
        Class responseType;
        boolean isCollection = isParameterizedType(type.getClass());
        if (isCollection) {
            responseType = getActualType(type);
        } else {
            responseType = (Class) type;
        }
        if (responseType == Stock.class) {
            String body = String.valueOf(delegateResponse);
            logger.info(body);
            List<Stock> stocks = Arrays.stream(body.split("\n")).map(Stock::of).collect(Collectors.toList());
            if (isCollection) {
                return stocks;
            }
            return stocks.get(0);
        }
        return delegateResponse;
    }

    public static Class getActualType(Type clazz) {
        return (Class) ((ParameterizedType) clazz).getActualTypeArguments()[0];
    }

    public static boolean isParameterizedType(Type type) {
        return ParameterizedType.class.isAssignableFrom((Class<?>) type);
    }
}
