package org.状态模式;

public class client {
    public static void main(String[] args) {
        Context context=new Context();
        ConcreteStatB concreteStatB=new ConcreteStatB();
        context.setState(concreteStatB);
        context.requset();
    }
}
