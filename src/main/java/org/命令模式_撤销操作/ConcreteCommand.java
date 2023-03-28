package org.命令模式_撤销操作;

public class ConcreteCommand implements Command{
    private Adder adder=new Adder();
    private int value;


    @Override
    public int execute(int value) {
       this.value=value;
     return  adder.add(value);

    }

    @Override
    public int undo() {
return adder.add(-value);
    }
}
