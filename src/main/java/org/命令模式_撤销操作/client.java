package org.命令模式_撤销操作;

public class client {


    public static void main(String[] args) {
        Calculatorform calculatorform=new Calculatorform();
        calculatorform.setCommand(new ConcreteCommand());
        calculatorform.compute(10);
        calculatorform.compute(5);
        calculatorform.undo();
        calculatorform.compute(15);
    }
}
