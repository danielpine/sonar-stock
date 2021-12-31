package io.github.danielpine.sonar.conf;

import feign.Contract;
import feign.codec.Decoder;
import io.github.danielpine.sonar.converter.SinaGenericHttpMessageConverter;
import io.github.danielpine.sonar.converter.SinaHttpMessageConverter;
import io.github.danielpine.sonar.decoder.SinaDecoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.HttpMessageConverterCustomizer;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;

public class SinaFeignClientsConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Decoder feignDecoder(ObjectProvider<HttpMessageConverterCustomizer> customizers) {
        return new SinaDecoder(new ResponseEntityDecoder(new SpringDecoder(feignHttpMessageConverter(), customizers)));
    }

    ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        SinaHttpMessageConverter sinaHttpMessageConverter = new SinaHttpMessageConverter();
        return () -> new HttpMessageConverters(sinaHttpMessageConverter, new SinaGenericHttpMessageConverter(sinaHttpMessageConverter));
    }

}
