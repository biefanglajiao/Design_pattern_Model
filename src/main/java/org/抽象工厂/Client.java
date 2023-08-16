package org.抽象工厂;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/22 21:57
 **/
public class Client {
    public static void main(String[] args) {

        Factory factory = new FamilyFactory();
        Pizza pizza;
        Hamburger hamburger;
        pizza= factory.producepizza();
        pizza.Box();
        pizza.prebark();
        pizza.cut();
        hamburger= factory.producehumburger();
        hamburger.Box();
        hamburger.cut();
        hamburger.prebark();
    }
}
