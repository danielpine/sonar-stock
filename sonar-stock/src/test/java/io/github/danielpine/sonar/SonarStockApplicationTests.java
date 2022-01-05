package io.github.danielpine.sonar;

import com.alibaba.fastjson.JSON;
import io.github.danielpine.sonar.base.GzipUtils;
import io.github.danielpine.sonar.converter.SinaHttpMessageConverter;
import io.github.danielpine.sonar.fetch.PriceProvider;
import io.github.danielpine.sonar.pojo.Stock;
import io.github.danielpine.sonar.service.QuotesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;

import javax.annotation.Resource;
import java.nio.charset.Charset;

@SpringBootTest
class SonarStockApplicationTests {

    @Resource
    PriceProvider priceProvider;
    @Resource
    QuotesService quotesService;

    @Test
    void testBillString() {
        System.out.println(JSON.toJSONString(quotesService.queryBills("sz000068"), true));
    }

    @Test
    void testString() {
        System.out.println(priceProvider.str("sz000068,sz000821"));
    }

    @Test
    void testOne() {
        System.out.println(priceProvider.one("sh600519"));
    }

    @Test
    void testList() {
        System.out.println(priceProvider.list("sz000068,sz000821"));
    }

    @Test
    void testConverter() {
        new SinaHttpMessageConverter().canRead(Stock.class, new MediaType("application", "javascript", Charset.forName("GB18030")));
    }
}
