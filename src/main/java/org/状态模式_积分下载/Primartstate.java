package org.状态模式_积分下载;

public class Primartstate extends AbstractState{
    public Primartstate(AbstractState state) {
        this.acc=state.acc;
        this.point=state.getPoint();
        this.stateName="新手";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("sprry"+acc.getName()+"has no power");
    }

    public Primartstate(FromAccount account) {
        this.point=0;
        this.acc=account;
        this.stateName="新手";


    }

    @Override
    public void checkState(int score) {
        if (point>=1000){
            acc.setState(new Highstate(this));
        }else if (point>=100){
            acc.setState(new MiddleState(this));
        }
    }
}
