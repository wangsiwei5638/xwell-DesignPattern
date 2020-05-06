package com.wsw.designpattern.structure.bridge;

public class BenzC200L extends AbstractionBenz{

    public BenzC200L(ImplementorColor color) {
        super(color);
    }

    @Override
    public void desc() {
        System.out.println("梅赛德斯奔驰C200L");
        super.desc();
    }
}
