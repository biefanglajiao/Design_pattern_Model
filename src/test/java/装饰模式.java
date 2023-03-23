import org.junit.Test;
import org.装饰模式.Car;
import org.装饰模式.Robot;
import org.装饰模式.Transform;

public class 装饰模式 {
    @Test
    public void aVoid(){
        Transform transform = new Car();
        transform.move();
        System.out.println("************");
        Robot robot = new Robot(transform);
        robot.move();
        robot.say();
    }
}
