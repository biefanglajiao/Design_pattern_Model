package org.状态模式_积分下载;

public class FromAccount {
    private AbstractState state;
    private String name;

    public String getName() {

        return name;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public FromAccount(String name) {
        this.name = name;
   this.state=new Primartstate(this);

        System.out.println(this.name+" success");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public void downloadFile(int score){
        state.downloadFile(score);
    }
    public void writeNote(int score){
        state.writeNote(score);
    }
    public void replayNote(int score){
        state.replayNote(score);
    }
}
