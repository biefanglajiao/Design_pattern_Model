package org.迭代器模式_常规;

public class Concreatellerator  implements Iterator {
    private ConcreteAggregate obj;
    private Object[] objects={"dog","cat","pig","bird"};
    public Concreatellerator(ConcreteAggregate obj) {
        this.obj = obj;
    }

    private int currentIndex=0;
    @Override
    public void first() {
        currentIndex=0;
    }

    @Override
    public void next() {
        if (currentIndex<objects.length){
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {

        return currentIndex!=objects.length;
    }

    @Override
    public Object currentltem() {
        return objects[currentIndex];
    }
}
