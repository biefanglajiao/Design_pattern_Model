package org.建造者模式;

public class LenovoBuilder extends ComputerBuilder {
    @Override
    public void buildhost() {
        computer.setHost("联想主机");
    }

    @Override
    public void builddisplay() {
        computer.setDisplay("联想显示器");
    }
}
