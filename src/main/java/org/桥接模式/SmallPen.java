package org.桥接模式;

public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType="small";
        this.color.bepaint(penType,name);
    }
}
