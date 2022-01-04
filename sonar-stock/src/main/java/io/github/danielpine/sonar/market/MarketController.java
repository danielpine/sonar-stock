package io.github.danielpine.sonar.market;

import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.fetch.PriceProvider;
import io.github.danielpine.sonar.pojo.Stock;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/exchange/markets")
@Api(tags = "交易市场的控制器")
public class MarketController {

    @Resource
    PriceProvider priceProvider;

    @ApiOperation(value = "通过的交易对以及深度查询当前的市场的深度数据")
    @GetMapping("/depth/{symbol}/{dept}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "symbol", value = "交易对"),
            @ApiImplicitParam(name = "dept", value = "深度类型"),})
    public Result<Stock> findDeptVosSymbol(@PathVariable("symbol") String symbol, @PathVariable("dept") String dept) {
        return Result.done(priceProvider.one(symbol));
    }
}
