import org.junit.Test;
import org.普通工厂2.Pizza;
import org.普通工厂2.PizzaFactory;

public class 普通工厂模式2 {
    @Test
    public void aa() throws Exception {

        Pizza pizza;

        pizza=PizzaFactory.producepizza("ChinesePizza");
        pizza.prePaer();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
