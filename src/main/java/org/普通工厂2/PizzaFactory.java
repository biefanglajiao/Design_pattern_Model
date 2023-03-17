package org.普通工厂2;

public class PizzaFactory {
    public static Pizza producepizza(String choice) throws Exception {
        if (choice.equals("GreekPizza")){

            System.out.println(choice+"ready");
            return new GreekPizzza();
        }
        if (choice.equals("ChinesePizza")){
            System.out.println(choice+"ready");
            return new ChinesePizza();

        }else throw new Exception("error");
    }
}
