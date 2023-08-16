package org.工厂方法;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/22 21:50
 **/
public class Clinet {
    public static void main(String[] args) {
        Pizza pizza;
        PizzaFactory pizzaFactory=new GreekPizzaFactory();
        pizza=pizzaFactory.producepizza();
        pizza.prePaer();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

}
