package org.桥接模式;

public class Yellow implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"yellow`s"+name);
    }
}
