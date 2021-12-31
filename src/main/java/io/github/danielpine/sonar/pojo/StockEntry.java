package io.github.danielpine.sonar.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StockEntry {
    enum Type {
        BUY, SELL;
    }

    private Type type;
    private BigDecimal value;
    private BigInteger size;
    private Integer level;

    public StockEntry(Type type, BigDecimal value, BigInteger size, Integer level) {
        this.type = type;
        this.value = value;
        this.size = size;
        this.level = level;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public void setLevel(Integer level) {
        this.level = level;
    }
}
