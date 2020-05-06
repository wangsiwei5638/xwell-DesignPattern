package com.wsw.designpattern.structure.bridge;

public class BenzG500 extends AbstractionBenz{

    public BenzG500(ImplementorColor color) {
        super(color);
    }

    @Override
    public void desc() {
        System.out.println("豪华越野车");
        System.out.println("奔驰大G500");
        super.desc();
    }
}
