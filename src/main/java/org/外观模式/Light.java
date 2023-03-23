package org.外观模式;

public class Light {
    private String position;
    public Light(String position){
        this.position=position;
    }
    public void on(){
        System.out.println("light on");
    }
    public void off(){
        System.out.println("light off");
    }

}
