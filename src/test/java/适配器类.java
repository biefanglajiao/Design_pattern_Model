import org.junit.Test;
import org.适配器模式.Bird;
import org.适配器模式.BirdAdapter;
import org.适配器模式.DogAdapter;
import org.适配器模式.Robot;

public class 适配器类 {
    @Test
    public  void aaa(){

        Robot robot= new DogAdapter();
        robot.run();
        robot.cry();
    }
    @Test
    public  void aa(){

        Robot robot= new BirdAdapter();
        robot.run();
        robot.cry();
    }
}
