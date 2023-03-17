package org.适配器模式;

public class DogAdapter extends Dog implements Robot{
    /***
     * 继承＋实现接口方法
     */
    @Override
    public void cry() {
        System.out.println("Robot..");
        super.wang();
    }

    @Override
    public void run() {
        System.out.println("Robot..");
    super.move();
    }
}
