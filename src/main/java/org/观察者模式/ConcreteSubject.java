package org.观察者模式;



public class ConcreteSubject extends Subject{
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
observers.remove(observer);
    }

    @Override
    public void notifys() {
for (Object o:observers){
    ((Observer)o).update();
}
    }
}
