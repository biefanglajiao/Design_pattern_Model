package org.建造者模式;

public  abstract class ComputerBuilder {
    protected Computer computer=new Computer();
    public abstract void  buildhost();
    public  abstract void  builddisplay();

    public Computer getComputer(){
        return  computer;
    }
}
