package org.观察者模式_猫狗老鼠;

/****
 * 假设猫是老鼠和狗的观察目标；老鼠和狗是观察者，猫叫老鼠跑，狗也跟着叫
 */
public class Client {
    public static void main(String[] args) {
        MySubject subject=new Cat();

        MyObserver observer1,observer2,observer3;
        observer1=new Mouse();
        observer2=new Dog();
        observer3=new Mouse();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.cry();
    }
}
