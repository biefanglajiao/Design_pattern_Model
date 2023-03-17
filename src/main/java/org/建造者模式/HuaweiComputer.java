package org.建造者模式;

public class HuaweiComputer extends ComputerBuilder {
    @Override
    public void buildhost() {
        computer.setHost("华为主机");
    }

    @Override
    public void builddisplay() {
        computer.setDisplay("华为显示器");
    }
}
