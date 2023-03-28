package org.命令模式1;

public class Controller1 {
    private Command command1,command2,command3;
    public Controller1(Command command1, Command command2, Command command3) {
        this.command1 = command1;
        this.command2 = command2;
        this.command3 = command3;
    }
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
