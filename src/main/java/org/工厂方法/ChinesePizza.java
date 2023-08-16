package org.工厂方法;

/****
 * 工厂方法和抽象工厂的区别：有没有汉堡抽象类以及对应的工厂类
 */
public class ChinesePizza implements Pizza {
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
