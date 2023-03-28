package org.命令模式;

public class ConcreateCommand implements Command{
    private  Receiver receiver;

    public ConcreateCommand() {
receiver=new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
