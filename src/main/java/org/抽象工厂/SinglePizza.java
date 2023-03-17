package org.抽象工厂;

public class SinglePizza implements Pizza {
    @Override
    public void prebark() {
        System.out.println("Ginglepizza前期准备");
    }

    @Override
    public void cut() {
        System.out.println("切Singlepizza");
    }

    @Override
    public void Box() {
        System.out.println("打包SinglePizza");
    }
}
