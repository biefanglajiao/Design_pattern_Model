package org.装饰模式;

public class Plane extends Changer{
    public Plane(Transform transform) {
        super(transform);
        System.out.println("变成了飞机");
    }

    public void fly(){
        System.out.println("飞行");
    }
}
