package org.工厂方法;

public class GreekPizzza implements Pizza {
    @Override
    public void prePaer() {
        System.out.println("GreekPrePaer");
    }

    @Override
    public void bake() {
        System.out.println("GreekBake");
    }

    @Override
    public void cut() {
        System.out.println("GreekCut");
    }

    @Override
    public void box() {
        System.out.println("GreekBox");
    }
}
