import org.junit.Test;
import org.抽象工厂.Factory;
import org.抽象工厂.FamilyFactory;
import org.抽象工厂.Hamburger;
import org.抽象工厂.Pizza;

public class 抽象工厂
{
    @Test
    public void aa(){
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
