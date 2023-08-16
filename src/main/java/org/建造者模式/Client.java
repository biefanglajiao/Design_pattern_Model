package org.建造者模式;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/22 22:00
 **/
public class Client {
    public static void main(String[] args) {

        ComputerBuilder computerBuilder=new LenovoBuilder();

        ComputerWaiter computerWaiter=new ComputerWaiter();
        computerWaiter.setComputerBuilder(computerBuilder);
        Computer computer=computerWaiter.construt();
        System.out.println(computer.getDisplay());

        System.out.println(computer.getHost());
    }
}
