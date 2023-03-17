package org.适配器模式;

public class BirdAdapter implements Robot {
    /****
     * 实现类 在关联方法
     */
    private Bird bird;

    public BirdAdapter() {
       bird=new Bird();
    }

    @Override
    public void cry() {
        System.out.println("robot....");
        bird.wang();
    }

    @Override
    public void run() {
        System.out.println("robot....");
            bird.move();
    }
}
