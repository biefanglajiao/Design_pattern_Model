package org.观察者模式_猫狗老鼠;

public class Cat extends MySubject{
    @Override
    public void cry() {
        System.out.println("猫叫");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Object o:observes){
            ((MyObserver)o).response();
        }
    }
}
