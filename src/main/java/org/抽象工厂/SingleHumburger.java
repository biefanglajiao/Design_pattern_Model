package org.抽象工厂;

public class SingleHumburger implements Hamburger{
    @Override
    public void prebark() {
        System.out.println("SingleHumburger准备");
    }

    @Override
    public void cut() {
        System.out.println("切SingleHumburger");
    }

    @Override
    public void Box() {
        System.out.println("打包SingleHumburger");
    }
}
