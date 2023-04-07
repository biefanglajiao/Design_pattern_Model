package org.迭代器模式_电视机遥控器;

public class SkyworthTV implements TV{
    private Object[] obj={"CCTV_1","CCTV_2","CCTV_3","CCTV_4","CCTV_5","CCTV_6","CCTV_7","CCTV_8","CCTV_9","CCTV_10","CCTV_11"};
    @Override
    public TVIterator createIterator() {
        return new SkyworthTVIterator();
    }

    private class SkyworthTVIterator implements TVIterator{
        private int currentIndex=0;
        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
if (currentIndex<obj.length){
    currentIndex++;
}
        }

        @Override
        public void previous() {
if (currentIndex>0)currentIndex--;
        }

        @Override
        public boolean isLast() {
           return currentIndex==obj.length;

        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }

        @Override
        public int longer() {
            return obj.length;
        }
    }
}
