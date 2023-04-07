package org.迭代器模式_电视机遥控器;

public interface TVIterator {
    void setChannel(int i);
    void next();
    void  previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();

    int longer();
}
