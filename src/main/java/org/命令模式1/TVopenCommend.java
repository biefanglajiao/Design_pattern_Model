package org.命令模式1;

public class TVopenCommend extends Command {
    private TV tv;

    public TVopenCommend() {
        tv = new TV();

    }

    @Override
    void execute() {
        tv.open();
    }
}
