package org.观察者模式_猫狗老鼠;

public class Dog implements MyObserver{
    @Override
    public void response() {
        System.out.println("狗也跟着叫！！");
    }
}
