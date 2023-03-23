package org.装饰模式;

public class Robot extends Changer{
    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成了机器人");
    }

    public void say(){
        System.out.println("说话");
    }
}
