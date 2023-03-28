package org.命令模式;

public class client {
    public static void main(String[] args) {
        Invoker invoker  =new Invoker(new ConcreateCommand());
        invoker.call();
    }



}
