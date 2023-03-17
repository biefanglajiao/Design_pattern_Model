package org.普通工厂2;

public class ChinesePizza implements Pizza{
    @Override
    public void prePaer() {
        System.out.println("ChinesePrePear");
    }

    @Override
    public void bake() {
        System.out.println("ChineseBake");
    }

    @Override
    public void cut() {
        System.out.println("ChineseCut");
    }

    @Override
    public void box() {
        System.out.println("ChineseBox");
    }
}
