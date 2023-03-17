import org.junit.Test;
import org.工厂方法.GreekPizzaFactory;
import org.工厂方法.Pizza;
import org.工厂方法.PizzaFactory;

public class 工厂方法 {
    @Test
    public  void  text(){
       Pizza pizza;
        PizzaFactory pizzaFactory=new GreekPizzaFactory();
        pizza=pizzaFactory.producepizza();
        pizza.prePaer();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
