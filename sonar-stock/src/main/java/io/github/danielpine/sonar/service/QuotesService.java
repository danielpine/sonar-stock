package io.github.danielpine.sonar.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import io.github.danielpine.sonar.base.GzipUtils;
import io.github.danielpine.sonar.base.Result;
import io.github.danielpine.sonar.fetch.KlineProvider;
import io.github.danielpine.sonar.fetch.QuotesProvider;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

@Service
public class QuotesService {

    @Resource
    QuotesProvider quotesProvider;

    @Resource
    KlineProvider klineProvider;

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

    public Result<Object> queryKline(String symbol, int scale) throws ParseException {
        JSONArray data = JSONObject.parseArray(klineProvider.str(symbol, scale, "no", 238));
        HashSet<String> days = Sets.newHashSet();
        ArrayList<JSONObject> elements = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            JSONObject json = data.getJSONObject(i);
            String day = Splitter.on(" ").splitToList(json.getString("day")).get(0);
            days.add(day);
            if (days.size() == 2) {
                elements = new ArrayList<>();
                days = Sets.newHashSet();
            }
            elements.add(json);
        }
        System.out.println(elements.size());
        if (elements.size() < 238) {
            JSONObject lastPoints = elements.get(elements.size() - 1);
            String day = lastPoints.getString("day");
            // 09:31~11:30
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date last = formatTime.parse(day);
            Date stage1 = formatTime.parse(formatDate.format(new Date()) + " 11:30:00");
            Date stage2 = formatTime.parse(formatDate.format(new Date()) + " 13:00:00");
            long time = last.getTime();
            System.out.println(238 - elements.size());
            int least = 240 - elements.size();
            for (int i = 0; i < least; i++) {
                if (time == stage1.getTime()) {
                    time = stage2.getTime();
                }
                JSONObject json = new JSONObject();
                time += 60 * 1000;
                json.put("day", formatTime.format(new Date(time)));
                json.put("place", true);
                if (time == stage1.getTime()) {
                    time = stage2.getTime();
                }
                elements.add(json);
            }
            System.out.println(elements.size());
        }
        return Result.done(elements);
    }

}
