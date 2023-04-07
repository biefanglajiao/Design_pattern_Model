package org.迭代器模式_内部类;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate=new ConcreteAggregate();
        Iterator iterator=aggregate.creatlterator();
        while (iterator.hasNext()){
            System.out.println(iterator.currentltem().toString());
            iterator.next();
        }
    }
}
