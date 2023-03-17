import org.junit.Test;
import org.建造者模式.*;

import javax.annotation.Resource;

public class 建造者模式
{
    @Test
    public void aa(){
        ComputerBuilder computerBuilder=new LenovoBuilder();

        ComputerWaiter computerWaiter=new ComputerWaiter();
        computerWaiter.setComputerBuilder(computerBuilder);
        Computer computer=computerWaiter.construt();
        System.out.println(computer.getDisplay());

        System.out.println(computer.getHost());



    }
}
