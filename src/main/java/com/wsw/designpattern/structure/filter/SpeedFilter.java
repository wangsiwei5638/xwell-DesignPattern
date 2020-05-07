package com.wsw.designpattern.structure.filter;

import java.util.*;

public class SpeedFilter implements Filter{

    //过滤条件
    private static final Map<String,Double> filterCriteria = new HashMap<String, Double>();
    static {
        //速度在170~270之间的都要被过滤
        //这里可以使用配置文件导入  或者数据库导入过滤条件
        filterCriteria.put("gt",170.00);
        filterCriteria.put("lt",270.00);
    }
    //SET方法

    public List<Benz> doFilte(List<Benz> benzs) {
        if(filterCriteria.isEmpty()){
            return benzs;
        }
        Iterator<Benz> iterator = benzs.iterator();
        while (iterator.hasNext()){
            Benz benz = iterator.next();
            Double maxKMPerHour = benz.getMaxKMPerHour();
            boolean b = true;
            for (Map.Entry<String, Double> entry : filterCriteria.entrySet()) {
                if(entry.getKey().equals("gt")){
                    b = b & maxKMPerHour > entry.getValue();
                }else if(entry.getKey().equals("lt")){
                    b = b & maxKMPerHour < entry.getValue();
                }
            }
            if(b){
                iterator.remove();
            }
        }
        return benzs;
    }
}
