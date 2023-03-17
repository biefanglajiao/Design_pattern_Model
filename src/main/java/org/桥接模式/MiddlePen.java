package org.桥接模式;

public class MiddlePen extends Pen{
    @Override
    public void draw(String name) {
        String pentype="middle";
        this.color.bepaint(pentype,name);
    }
}
