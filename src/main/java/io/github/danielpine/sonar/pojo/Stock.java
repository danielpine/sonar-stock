package io.github.danielpine.sonar.pojo;


import io.github.danielpine.sonar.base.Splitter;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stock {

    /**
     * Columns for sina api outputs
     */
    private final static List<String> columns = getColumns();

    private String security;
    private String name;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal current;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal bid;
    private BigDecimal ask;
    private BigDecimal volume;
    private BigDecimal money;
    private String date;
    private String time;
    private List<StockEntry> stockEntries = StockEntry.generate();
    private final Map<String, StockEntry> stockEntriesMap = stockEntries.stream()
            .collect(Collectors.toMap(e -> "ENTRY_" + e.getType() + "_" + e.getLevel(), Function.identity()));

    /**
     * * var hq_str_sz000068="华控赛格,3.290,3.300,3.460,3.630,3.250,3.450,3.460,33415418,115174893.560,41300,3.450,99500,3.440,123700,3.430,300200,3.420,219500,3.410,12200,3.460,82100,3.470,108500,3.480,121200,3.490,224800,3.500,2021-12-31,11:10:33,00";
     * * 0: 华控赛格 :股票名字；
     * * 1: 27.55 :今日开盘价；
     * * 2: 27.25 :昨日收盘价；
     * * 3: 26.91 :当前价格；
     * * 4: 27.55 :今日最高价；
     * * 5: 26.20 :今日最低价；
     * * 6: 26.91 :竞买价 :即买一报价；
     * * 7: 26.92 :竞卖价 :即卖一报价；
     * * 8: 22114263 :成交的股票数 :由于股票交易以一百股为基本单位 :所以在使用时 :通常把该值除以一百；
     * * 9: 589824680 :成交金额 :单位为元 :为了一目了然 :通常以万元为成交金额的单位 :所以通常把该值除以一万；
     * * 10: 4695 :买一申请4695股 :即47手；
     * * 11: 26.91 :买一报价；
     * * 12: 57590 :买二
     * * 13: 26.90 :买二
     * * 14: 14700 :买三
     * * 15: 26.89 :买三
     * * 16: 14300 :买四
     * * 17: 26.88 :买四
     * * 18: 15100 :买五
     * * 19: 26.87 :买五
     * * 20: 3100 :卖一申报3100股 :即31手；
     * * 21: 26.92 :卖一报价
     * * (22, 23), (24, 25), (26,27), (28, 29)分别为卖二至卖四的情况
     * * 30: 2008-01-11 :日期；
     * * 31: 15:05:32 :时间；
     */
    public static Stock of(String javascript) {
        return from(Splitter.on(",")
                .keys(columns)
                .splitToMap(cutting(javascript)));
    }

    private static Stock from(Map<String, String> map) {
        Stock stock = new Stock();
        map.forEach(stock::setBy);
        return stock;
    }

    private void setBy(String k, String v) {
        try {
            if ("useless".equals(k)) {
                return;
            } else if (k.startsWith("ENTRY")) {
                String[] split = k.split("@");
                String key = split[0];
                String type = split[1];
                StockEntry entry = stockEntriesMap.get(key);
                if ("size".equals(type)) {
                    entry.setSize(new BigInteger(v));
                } else if ("value".equals(type)) {
                    entry.setValue(new BigDecimal(v));
                } else {
                    throw new InvalidKeyException("Not support type " + type);
                }
            } else {
                Field field = getClass().getDeclaredField(k);
                field.setAccessible(true);
                if (field.getGenericType() == BigDecimal.class) {
                    field.set(this, new BigDecimal(v));
                } else {
                    field.set(this, v);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String cutting(String javascript) {
        return javascript
                .replace("var hq_str_", "")
                .replace("\";", "")
                .replace("=\"", ",");
    }

    @Override
    public String toString() {
        return "Stock{" +
                "security='" + security + '\'' +
                ", name='" + name + '\'' +
                ", open=" + open +
                ", close=" + close +
                ", current=" + current +
                ", high=" + high +
                ", low=" + low +
                ", bid=" + bid +
                ", ask=" + ask +
                ", volume=" + volume +
                ", money=" + money +
                ", stockEntries=" + stockEntries +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    private static List<String> getColumns() {
        List<String> keys = Arrays.asList(
                "security",
                "name",
                "open",
                "close",
                "current",
                "high",
                "low",
                "bid",
                "ask",
                "volume",
                "money",
                "ENTRY_BUY_1@size",
                "ENTRY_BUY_1@value",
                "ENTRY_BUY_2@size",
                "ENTRY_BUY_2@value",
                "ENTRY_BUY_3@size",
                "ENTRY_BUY_3@value",
                "ENTRY_BUY_4@size",
                "ENTRY_BUY_4@value",
                "ENTRY_BUY_5@size",
                "ENTRY_BUY_5@value",
                "ENTRY_SELL_1@size",
                "ENTRY_SELL_1@value",
                "ENTRY_SELL_2@size",
                "ENTRY_SELL_2@value",
                "ENTRY_SELL_3@size",
                "ENTRY_SELL_3@value",
                "ENTRY_SELL_4@size",
                "ENTRY_SELL_4@value",
                "ENTRY_SELL_5@size",
                "ENTRY_SELL_5@value",
                "date",
                "time",
                "useless"
        );
        Collections.reverse(keys);
        return keys;
    }
}
