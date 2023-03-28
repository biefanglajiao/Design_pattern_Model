package org.命令模式_宏命令;

public class client {


    public static void main(String[] args) {
        MacroComand commandList = new MacroComand();
        ConcreteCommandA command1 = new ConcreteCommandA();
        ConcreteCommandB command2 = new ConcreteCommandB();
        commandList.addCommand(command1);
        commandList.addCommand(command2);
        commandList.addCommand(command1);
        commandList.excute();
    }

}
