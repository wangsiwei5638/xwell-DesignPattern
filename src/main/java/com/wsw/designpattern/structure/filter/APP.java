package com.wsw.designpattern.structure.filter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，
 * 这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
 * 这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class APP {


    public static void main(String[] args) {
        Filter colorFilter = new ColorFilter();
        List<Benz> benzs = data();
        System.out.println(benzs);
        colorFilter.doFilte(benzs);
        System.out.println(benzs);

        Filter speedFilter = new SpeedFilter();
        benzs = data();
        System.out.println(benzs);
        speedFilter.doFilte(benzs);
        System.out.println(benzs);


    }

    static List<Benz> data(){
        List<Benz> benzs = new ArrayList<Benz>();
        Benz benz0 = new Benz("北京奔驰E300L", "red", 180.00, new BigDecimal(450000), "北京奔驰");
        Benz benz1 = new Benz("北京奔驰C200L", "blue", 150.00, new BigDecimal(350000), "北京奔驰");
        Benz benz2 = new Benz("北京奔驰C200L", "pink", 150.00, new BigDecimal(350000), "北京奔驰");
        Benz benz3 = new Benz("北京奔驰C260L", "black", 180.00, new BigDecimal(400000), "北京奔驰");
        Benz benz4 = new Benz("北京奔驰E300L", "white", 180.00, new BigDecimal(450000), "北京奔驰");
        Benz benz5 = new Benz("进口奔驰GT", "yellow", 350.00, new BigDecimal(1050000), "进口奔驰");
        Benz benz6 = new Benz("进口奔驰S450", "red", 230.00, new BigDecimal(1300000), "进口奔驰");
        benzs.add(benz0);
        benzs.add(benz1);
        benzs.add(benz2);
        benzs.add(benz3);
        benzs.add(benz4);
        benzs.add(benz5);
        benzs.add(benz6);
        return benzs;
    }

}
