package com.wsw.designpattern.structure.bridge;

public class BenzE300L extends AbstractionBenz{

    public BenzE300L(ImplementorColor color) {
        super(color);
    }

    @Override
    public void desc() {
        System.out.println("豪华d级车");
        System.out.println("梅赛德斯奔驰E300L");
        super.desc();
    }
}
