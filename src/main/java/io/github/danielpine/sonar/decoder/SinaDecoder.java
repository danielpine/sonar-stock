package io.github.danielpine.sonar.decoder;

import feign.Response;
import feign.codec.Decoder;
import io.github.danielpine.sonar.pojo.Stock;
import org.springframework.http.HttpEntity;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Objects;

public class SinaDecoder implements Decoder {

    final Decoder delegate;

    public SinaDecoder(Decoder delegate) {
        Objects.requireNonNull(delegate, "Decoder must not be null. ");
        this.delegate = delegate;
    }

    /**
     * var hq_str_sh600519="贵州茅台,2070.000,2075.000,2044.470,2072.980,2031.000,2043.150,2044.470,1279599,2622604481.000,100,2043.150,100,2043.140,100,2043.130,100,2043.020,500,2043.010,400,2044.470,100,2044.490,100,2044.900,100,2044.970,100,2044.990,2021-12-31,11:10:33,00,";
     * var hq_str_sz000068="华控赛格,3.290,3.300,3.460,3.630,3.250,3.450,3.460,33415418,115174893.560,41300,3.450,99500,3.440,123700,3.430,300200,3.420,219500,3.410,12200,3.460,82100,3.470,108500,3.480,121200,3.490,224800,3.500,2021-12-31,11:10:33,00";
     * 0: 贵州茅台 :股票名字
     * 1: 27.55 :今日开盘价
     * 2: 27.25 :昨日收盘价
     * 3: 26.91 :当前价格
     * 4: 27.55 :今日最高价
     * 5: 26.20 :今日最低价
     * 6: 26.91 :竞买价 :即买一报价
     * 7: 26.92 :竞卖价 :即卖一报价
     * 8: 22114263 :成交的股票数 :由于股票交易以一百股为基本单位 :所以在使用时 :通常把该值除以一百
     * 9: 589824680 :成交金额 :单位为元 :为了一目了然 :通常以万元为成交金额的单位 :所以通常把该值除以一万
     * 10: 4695 :买一申请4695股 :即47手
     * 11: 26.91 :买一报价
     * 12: 57590 :买二
     * 13: 26.90 :买二
     * 14: 14700 :买三
     * 15: 26.89 :买三
     * 16: 14300 :买四
     * 17: 26.88 :买四
     * 18: 15100 :买五
     * 19: 26.87 :买五
     * 20: 3100 :卖一申报3100股 :即31手
     * 21: 26.92 :卖一报价
     * (22, 23), (24, 25), (26,27), (28, 29)分别为卖二至卖四的情况
     * 30: 2008-01-11 :日期
     * 31: 15:05:32 :时间
     *
     * @param response
     * @param type
     * @return
     * @throws IOException
     */
    @Override
    public Object decode(Response response, Type type) throws IOException {
        Object delegateResponse = delegate.decode(response, type);
        Class responseType = (Class) type;
        boolean isCollection = isCollection(type.getClass());
        if (isCollection) {
            responseType = getActualType(type);
        }
        if (responseType == Stock.class) {
            String body = String.valueOf(delegate.decode(response, type));
            Stock.of(body);
        }
        return delegateResponse;
    }

    public static Class getActualType(Type clazz) {
        return (Class) ((ParameterizedType) clazz).getActualTypeArguments()[0];
    }

    private boolean isCollection(Type type) {
        if (type instanceof Class) {
            Class c = (Class) type;
            return Collection.class.isAssignableFrom(c);
        }
        return false;
    }
}
