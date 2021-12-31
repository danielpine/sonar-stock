package io.github.danielpine.sonar.fetch;

import io.github.danielpine.sonar.conf.SinaFeignClientsConfiguration;
import io.github.danielpine.sonar.pojo.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sina-stock-api", url = "http://hq.sinajs.cn", configuration = SinaFeignClientsConfiguration.class)
public interface PriceProvider {
    @GetMapping
    Stock list(@RequestParam("list") String list);
}
