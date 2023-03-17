package org.桥接模式;

public class Blue implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "blue`s" + name);
    }
}
