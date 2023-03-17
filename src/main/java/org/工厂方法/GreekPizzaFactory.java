package org.工厂方法;

public class GreekPizzaFactory implements  PizzaFactory{
    @Override
    public Pizza producepizza() {
        System.out.println("GreekPizza Ready");
        return new GreekPizzza();
    }
}
