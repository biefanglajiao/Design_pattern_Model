package org.桥接模式;

public class Green implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+" Green`s "+name);
    }
}
