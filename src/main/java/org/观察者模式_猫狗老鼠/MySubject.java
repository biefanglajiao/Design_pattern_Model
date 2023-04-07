package org.观察者模式_猫狗老鼠;

import org.组合模式.AbstractElement;

import java.util.ArrayList;

public abstract class MySubject
{
    protected ArrayList observes=new ArrayList();
    //注册
    public  void attach(MyObserver observer){
        observes.add(observer);
    }
    public void detach(MyObserver observer){
        observes.remove(observer);
    }
    public abstract void cry();
}
