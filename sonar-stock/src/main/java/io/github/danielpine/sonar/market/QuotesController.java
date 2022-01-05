package io.github.danielpine.sonar.market;

import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.service.QuotesService;
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
@RequestMapping("/exchange/quotes")
@Api(tags = "交易数据接口")
public class QuotesController {

    @Resource
    QuotesService quotesService;

    @GetMapping("/bills/{symbol}")
    @ApiOperation(value = "查询交易明细")
    @ApiImplicitParams({@ApiImplicitParam(name = "symbol", value = "股票代码")})
    public Result<Object> queryBills(@PathVariable("symbol") String symbol) {
        return quotesService.queryBills(symbol);
    }

}
