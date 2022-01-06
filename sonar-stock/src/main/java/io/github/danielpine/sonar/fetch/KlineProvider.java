package io.github.danielpine.sonar.fetch;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "sina-quotes-service-kline",
        url = "https://quotes.sina.cn/cn/api/json_v2.php/")
public interface KlineProvider {
    @GetMapping(
            value = "/CN_MarketDataService.getKLineData")
    String str(
            @RequestParam("symbol") String symbol,//sz000068
            @RequestParam("scale") int scale,//1
            @RequestParam("ma") String ma,//no
            @RequestParam("datalen") int datalen//240
    );
}
