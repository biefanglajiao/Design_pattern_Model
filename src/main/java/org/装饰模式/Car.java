package org.装饰模式;

public class Car implements     Transform{
    public Car() {
        System.out.println("变形金刚是一辆车");
    }
    @Override
    public void move() {
        System.out.println("变形金刚在陆地上移动");
    }
}
