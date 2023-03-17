package org.工厂方法;

public class ChinesePizzaFactory implements PizzaFactory{
    @Override
    public Pizza producepizza() {
        System.out.println("ChinesePizzaready");
        return new ChinesePizza();
    }
}
