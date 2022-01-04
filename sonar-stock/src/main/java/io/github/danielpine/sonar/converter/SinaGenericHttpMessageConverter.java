package io.github.danielpine.sonar.converter;

import io.github.danielpine.sonar.decoder.SinaDecoder;
import io.github.danielpine.sonar.pojo.Stock;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Arrays;

public class SinaGenericHttpMessageConverter extends AbstractGenericHttpMessageConverter {

    StringHttpMessageConverter delegate;

    public SinaGenericHttpMessageConverter(StringHttpMessageConverter delegate) {
        this.delegate = delegate;
        setSupportedMediaTypes(Arrays.asList(new MediaType("application", "javascript", Charset.forName("GB18030"))));
    }

    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return delegate.read(clazz, inputMessage);
    }

    @Override
    protected void writeInternal(Object o, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

    }

    @Override
    public Object read(Type type, Class contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return readInternal(SinaDecoder.getActualType(type), inputMessage);
    }

    @Override
    protected boolean supports(Class clazz) {
        if (SinaDecoder.isParameterizedType(clazz)) {
            return SinaDecoder.getActualType(clazz) == Stock.class;
        }
        return false;
    }
}
