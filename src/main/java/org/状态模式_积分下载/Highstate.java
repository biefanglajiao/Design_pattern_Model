package org.状态模式_积分下载;

public class Highstate extends AbstractState{
    public Highstate(AbstractState state) {
        this.acc=state.acc;
        this.point=state.point;
        this.stateName="专家";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println(acc.getName()+"下载文件，扣除"+score+"积分");
        this.point-=score/2;
        checkState(score);
        System.out.println("剩余积分为："+this.point+",当前级别为："+acc.getState().stateName);
    }

    @Override
    public void writeNote(int score) {
        System.out.println(acc.getName()+"发布留言，增加"+score+"积分");
        this.point+=score*2;
        checkState(score);
        System.out.println("剩余积分为："+this.point+",当前级别为："+acc.getState().stateName);
    }

    @Override
    public void checkState(int score) {
        if (point<0){
            System.out.println("余额不足 ，下载失败");
this.point+=score;
        }else if (point<=100){
            acc.setState(new Primartstate(this));
        }else if (point<=1000){
            acc.setState(new MiddleState(this));
        }
    }

}
