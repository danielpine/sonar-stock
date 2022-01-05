package io.github.danielpine.sonar.fetch;

import io.github.danielpine.sonar.conf.FeignRequestInterceptor;
import io.github.danielpine.sonar.conf.SinaFeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "sina-quotes-service-api",
        url = "https://vip.stock.finance.sina.com.cn/quotes_service/api/json_v2.php"
//        , configuration = {SinaFeignClientsConfiguration.class, FeignRequestInterceptor.class}
)
public interface QuotesProvider {
    @GetMapping(value = "/CN_Bill.GetBillList",
            headers = {
                    "method=GET", "authority=vip.stock.finance.sina.com.cn", "scheme=https",
                    "path=/quotes_service/api/json_v2.php/CN_Bill.GetBillList?symbol=sh601006&num=60&page=1&sort=ticktime&asc=0&volume=40000&amount=0&type=0&day=",
                    "pragma=no-cache",
                    "cache-control=no-cache",
                    "user-agent=Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.87 Safari/537.36 SE 2.X MetaSr 1.0",
                    "sec-fetch-dest=empty",
                    "accept=*/*",
                    "sec-fetch-site=same-origin",
                    "sec-fetch-mode=cors",
                    "referer=https://vip.stock.finance.sina.com.cn/quotes_service/view/vMS_tradedetail.php?symbol=sh601006",
                    "accept-encoding=gzip, deflate, br",
                    "accept-language=zh-CN,zh;q=0.9",
                    "cookie=UOR=,finance.sina.com.cn,;"})
    HttpEntity<byte[]> str(
            @RequestParam("symbol") String symbol,//sz000068
            @RequestParam("num") int num,//60
            @RequestParam("page") int page,//1
            @RequestParam("sort") String sort,//ticktime
            @RequestParam("asc") int asc,//0
            @RequestParam("volume") int volume,//40000
            @RequestParam("amount") int amount,//0
            @RequestParam("type") int type //0
    );
}
