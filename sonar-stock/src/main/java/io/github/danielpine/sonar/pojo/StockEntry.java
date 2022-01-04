package io.github.danielpine.sonar.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@Data
public class StockEntry {
    enum Type {BUY, SELL}

    private final Type type;
    private BigDecimal value;
    private BigInteger size;
    private final Integer level;
    private String percent;

    public static List<StockEntry> generate() {
        return Arrays.asList(
                buy(1),
                buy(2),
                buy(3),
                buy(4),
                buy(5),
                sell(1),
                sell(2),
                sell(3),
                sell(4),
                sell(5)
        );
    }

    public static StockEntry buy(Integer level) {
        return new StockEntry(Type.BUY, level);
    }

    public static StockEntry sell(Integer level) {
        return new StockEntry(Type.SELL, level);
    }

    public StockEntry(Type type, Integer level) {
        this.type = type;
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigInteger getSize() {
        return size;
    }

    public void setSize(BigInteger size) {
        this.size = size;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "StockEntry{" +
                "type=" + type +
                ", value=" + value +
                ", size=" + size +
                ", level=" + level +
                ", percent='" + percent + '\'' +
                '}';
    }
}
