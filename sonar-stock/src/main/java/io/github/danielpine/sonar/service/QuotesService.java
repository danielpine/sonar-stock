package io.github.danielpine.sonar.service;

import com.alibaba.fastjson.JSON;
import io.github.danielpine.sonar.base.GzipUtils;
import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.fetch.QuotesProvider;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.Charset;

@Service
public class QuotesService {

    @Resource
    QuotesProvider quotesProvider;

    public Result<Object> queryBills(String symbol) {
        HttpEntity<byte[]> entity = quotesProvider.str(
                symbol,
                60,
                1,
                "ticktime",
                0,
                40000,
                0,
                0);
        String res = GzipUtils.uncompressToString(entity.getBody(), Charset.forName("GBK"));
        return Result.done(JSON.parse(res));
    }

}
