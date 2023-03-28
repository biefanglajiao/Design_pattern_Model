package org.命令模式1;

public class TVchangeCommend extends Command{
    private TV tv;

    public TVchangeCommend() {
        tv = new TV();

    }

    @Override
    void execute() {
        tv.change();
    }
}
