package com.wsw.designpattern.structure.filter;

import java.math.BigDecimal;

public class Benz {

    private String name;
    private String color;
    private Double maxKMPerHour;
    private BigDecimal price;
    private String desc;

    public Benz(String name, String color, Double maxKMPerHour, BigDecimal price, String desc) {
        this.name = name;
        this.color = color;
        this.maxKMPerHour = maxKMPerHour;
        this.price = price;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getMaxKMPerHour() {
        return maxKMPerHour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Benz{" +
                "名称='" + name + '\'' +
                ", 车漆颜色='" + color + '\'' +
                ", 最高时速=" + maxKMPerHour +
                ", 价格=" + price +
                ", 描述='" + desc + '\'' +
                '}';
    }
}
