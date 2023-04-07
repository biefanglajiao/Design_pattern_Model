package org.迭代器模式_常规;

public class ConcreteAggregate implements Aggregate {

    @Override
    public Iterator creatlterator() {
        return new Concreatellerator(this);
    }


}
