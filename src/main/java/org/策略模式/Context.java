package org.策略模式;

public class Context {
    private Absreactstrategy strategy;


    public void algorithm() {
        strategy.algorithm();
    }

    public void setStrategy(Absreactstrategy strategy) {
        this.strategy = strategy;
    }
}
