package io.github.danielpine.sonar.conf;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.*;
import java.util.stream.Collectors;

//@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {
    Logger log = LoggerFactory.getLogger(FeignRequestInterceptor.class);

    @Override
    public void apply(RequestTemplate template) {
        if (template.feignTarget().url().contains("sinajs")) {
            Collection<String> params = template.queries().get("list");
            HashMap<String, Collection<String>> queries = new HashMap<>();
            queries.put("list", params.stream().map(this::decode).collect(Collectors.toList()));
            template.queries(null);
            template.queries(queries);
            log.info("请求参数为：{}", template.queryLine());
        }
    }

    private String decode(String param) {
        return param.replace("%2C", ",");
    }
}
