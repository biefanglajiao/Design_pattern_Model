package org.观察者模式;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        //具体更新代码
        System.out.println("update");
    }
}
