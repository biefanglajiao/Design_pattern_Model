package org.命令模式_宏命令;

public class Invoke {
    private  Command command1 ;
    private  Command command2 ;
    private  Command commandList ;

    public Invoke(Command command1, Command command2, Command command3) {
        this.command1 = command1;
        this.command2 = command2;
        this.commandList = commandList;
    }

    public void setCommand1(Command command1) {
        this.command1 = command1;
    }

    public void setCommand2(Command command2) {
        this.command2 = command2;
    }

    public void setCommand3(Command command3) {
        this.commandList = commandList;
    }

    public void excute(){
        command1.excute();
    }
}
