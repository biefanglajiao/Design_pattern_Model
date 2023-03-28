package org.命令模式_撤销操作;

public class Calculatorform {
    private  Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void compute(int value){
        int i=command.execute(value);
        System.out.println("ansower:" +i);
    }
    public void  undo(){
        int i=command.undo();
        System.out.println("ansowers:"+i);
    }
}
