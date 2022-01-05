package io.github.danielpine.sonar.market;

import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.service.QuotesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/exchange/quotes") //tradeAreas
@Api(tags = "交易数据接口")
public class QuotesController {

    @Resource
    QuotesService quotesService;

    @GetMapping("/bills")
    @ApiOperation(value = "查询交易明细")
    public Result<Object> getTradeAreaMarkets() {
        return quotesService.queryBills("sz000068");
    }
}
