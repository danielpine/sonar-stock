package io.github.danielpine.sonar;

import io.github.danielpine.sonar.fetch.PriceProvider;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SonarStockApplicationTests {

    @Resource
    PriceProvider priceProvider;

    @Test
    void contextLoads() {
        System.out.println(priceProvider.list("sz000068"));
    }

}
