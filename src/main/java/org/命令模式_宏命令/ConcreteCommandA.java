package org.命令模式_宏命令;

public class ConcreteCommandA extends  Command{
    private ReceicerA receicerA=new ReceicerA();


    @Override
    public void excute() {
receicerA.action();
    }
}
