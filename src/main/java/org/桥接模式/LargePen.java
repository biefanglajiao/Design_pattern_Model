package org.桥接模式;

public class LargePen extends Pen{
    @Override
    public void draw(String name) {
        String penType="big";
        this.color.bepaint(penType,name);
    }
}
