package org.观察者模式;

public class Client
{
    public static void main(String[] args) {

        Subject subject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        subject.attach(observer);
        subject.notifys();
    }
}
