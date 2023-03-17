package org.建造者模式;

public class ComputerWaiter {

private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public Computer construt(){
        computerBuilder.builddisplay();
        computerBuilder.buildhost();
        return computerBuilder.getComputer();
    }
}
