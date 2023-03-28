package org.命令模式1;

public class TVcloseCommend extends Command{
    private TV tv;

    public TVcloseCommend() {
        tv = new TV();

    }

    @Override
    void execute() {
        tv.close();
    }
}
