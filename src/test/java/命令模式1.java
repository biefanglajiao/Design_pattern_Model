import org.junit.Test;
import org.命令模式1.*;

public class 命令模式1 {
    /***
     * 使用conreoiller
     */
    @Test
    public void client1(){
Controller controller=new Controller();
controller.open();
controller.change();
controller.close();
    }

    /**使用controller1
     *
     */
    @Test
    public void client2(){
        Command opencommand,closecommand,changecommand;
        opencommand=new TVopenCommend();
        closecommand=new TVcloseCommend();
        changecommand=new TVchangeCommend();
        Controller1 controller=new Controller1(opencommand,closecommand,changecommand);
        controller.open();
        controller.change();
        controller.close();
    }
}
