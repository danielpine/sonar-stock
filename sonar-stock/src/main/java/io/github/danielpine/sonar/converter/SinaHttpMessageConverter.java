package io.github.danielpine.sonar.converter;

import io.github.danielpine.sonar.decoder.SinaDecoder;
import io.github.danielpine.sonar.pojo.Stock;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.nio.charset.Charset;
import java.util.Arrays;

public class SinaHttpMessageConverter extends StringHttpMessageConverter {

    public SinaHttpMessageConverter() {
        setSupportedMediaTypes(Arrays.asList(new MediaType("application", "javascript", Charset.forName("GB18030"))));
    }

    @Override
    public boolean supports(Class<?> clazz) {
        if (SinaDecoder.isParameterizedType(clazz)) {
            return SinaDecoder.getActualType(clazz) == Stock.class;
        }
        return clazz == Stock.class;
    }

}
