package org.观察者模式_猫狗老鼠;

public class Mouse implements MyObserver{
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑");
    }
}
