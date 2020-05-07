package com.wsw.designpattern.structure.proxy;

/**
 * 奔驰车主
 */
public class BenzVendor implements Vendor{

    public void sell() {
        System.out.println("车主卖出一台二手奔驰，预计卖出价20万");
    }

    public void sell2() {
        System.out.println("2");
    }
}
