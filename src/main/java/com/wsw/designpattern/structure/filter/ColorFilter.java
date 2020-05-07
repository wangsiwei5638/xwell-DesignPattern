package com.wsw.designpattern.structure.filter;

import java.util.*;

public class ColorFilter implements Filter{

    //过滤条件
    private static final List<String> filterCriteria = new ArrayList<String>();
    static {
        //这里可以使用配置文件导入  或者数据库导入过滤条件
        filterCriteria.addAll(Arrays.asList("red","blue"));
    }
    //SET方法

    public List<Benz> doFilte(List<Benz> benzs) {
        if(filterCriteria.isEmpty()){
            return benzs;
        }
        Iterator<Benz> iterator = benzs.iterator();
        while (iterator.hasNext()){
            Benz benz = iterator.next();
            if(filterCriteria.contains(benz.getColor())){
                iterator.remove();
            }
        }
        return benzs;
    }
}
