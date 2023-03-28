package org.命令模式1;

public class Controller {
    private Command command1=new TVchangeCommend();
    private  Command command2=new TVopenCommend();
    private  Command command3=new TVcloseCommend();

   public void open(){
       command2.execute();
   }
   public void close(){
       command3.execute();
   }
   public  void change(){
       command1.execute();
   }
}
