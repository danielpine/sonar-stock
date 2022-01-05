package io.github.danielpine.sonar.market;

import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.fetch.PriceProvider;
import io.github.danielpine.sonar.pojo.Stock;
import io.github.danielpine.sonar.service.QuotesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/exchange/tradeAreas") //tradeAreas
@Api(tags = "交易区域的数据接口")
public class TradeAreaController {

    @Resource
    PriceProvider priceProvider;
    @Resource
    QuotesService quotesService;

    @GetMapping("/markets")
    @ApiOperation(value = "查询交易区域,以及区域下的市场")
    public Result<List<Stock>> getTradeAreaMarkets() {
        return Result.done(priceProvider.list("sz000068,sz000612"));
    }

    @GetMapping("/market/favorite")
    @ApiOperation(value = "用户收藏的交易市场")
    public Result<List<Stock>> getUserFavoriteMarkets() {
        return Result.done(priceProvider.list("sz000068,sz000612"));
    }
}
