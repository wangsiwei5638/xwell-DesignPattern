package com.wsw.designpattern.structure.bridge;

/**
 * 奔驰抽象
 */
public abstract class AbstractionBenz {

    private ImplementorColor color;

    public AbstractionBenz(ImplementorColor color) {
        this.color = color;
    }

    public ImplementorColor getColor() {
        return color;
    }

    public void setColor(ImplementorColor color) {
        this.color = color;
    }

    public void desc(){
        this.color.color();
    }

}
