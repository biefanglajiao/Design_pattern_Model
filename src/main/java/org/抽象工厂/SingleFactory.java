package org.抽象工厂;

public class SingleFactory implements Factory{
    @Override
    public Pizza producepizza() {
        return new SinglePizza();
    }

    @Override
    public Hamburger producehumburger() {
        return new SingleHumburger();
    }
}
