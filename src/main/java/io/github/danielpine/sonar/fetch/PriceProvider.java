package io.github.danielpine.sonar.fetch;

import io.github.danielpine.sonar.conf.FeignRequestInterceptor;
import io.github.danielpine.sonar.conf.SinaFeignClientsConfiguration;
import io.github.danielpine.sonar.pojo.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        name = "sina-stock-api",
        url = "http://hq.sinajs.cn",
        configuration = {SinaFeignClientsConfiguration.class, FeignRequestInterceptor.class})
public interface PriceProvider {
    /**
     * String res
     *
     * @param list
     * @return
     */
    @GetMapping
    String str(@RequestParam("list") String list);

    /**
     * single security
     *
     * @param list
     * @return
     */
    @GetMapping
    Stock one(@RequestParam("list") String list);

    /**
     * list comma splitted
     *
     * @param list
     * @return
     */
    @GetMapping
    List<Stock> list(@RequestParam("list") String list);
}
