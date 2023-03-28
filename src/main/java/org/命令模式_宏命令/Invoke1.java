package org.命令模式_宏命令;

public class Invoke1 {
    private  Command command1 ;
    private  Command command2=new ConcreteCommandA() ;
    private  Command command3 =new ConcreteCommandB() ;

    public Invoke1(Command command1) {
        this.command1 = command1;
    }

    public void setCommand1(Command command1) {
        this.command1 = command1;
    }
    public void call(){
        command1.addCommand(command2);
        command1.addCommand(command3);
        command1.addCommand(command2);
        command1.excute();

    }
}
