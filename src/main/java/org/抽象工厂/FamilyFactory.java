package org.抽象工厂;

public class FamilyFactory implements  Factory{
    @Override
    public Pizza producepizza() {
        System.out.println("Family       Pizza");
        return new FamilyPizza();

    }

    @Override
    public Hamburger producehumburger() {
        System.out.println("Family Humburger");
        return new FamilyHumburger();
    }
}
