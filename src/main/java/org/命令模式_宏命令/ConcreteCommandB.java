package org.命令模式_宏命令;

public class ConcreteCommandB extends Command{
    private RececerB rececerB=new RececerB();

    @Override
    void excute() {

        rececerB.action();
    }
}
