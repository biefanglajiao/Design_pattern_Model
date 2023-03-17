package org.桥接模式;

public class Red implements Color
{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"red`s"+name);
    }
}
