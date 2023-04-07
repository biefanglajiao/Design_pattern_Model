package org.迭代器模式_内部类;

public class ConcreteAggregate implements Aggregate{
    private Object[] obj={"dog","cat","pig","bird"};
    @Override
    public Iterator creatlterator() {
       return new NewIterator();
    }

    private class NewIterator implements Iterator{
        private int currentIndex=0;
        @Override
        public void first() {
            currentIndex=0;
        }

        @Override
        public void next() {
if (currentIndex<obj.length){
    currentIndex++;
}
        }

        @Override
        public boolean hasNext() {

           return currentIndex!=obj.length;

        }

        @Override
        public Object currentltem() {
          return obj[currentIndex];
        }
    }
}
