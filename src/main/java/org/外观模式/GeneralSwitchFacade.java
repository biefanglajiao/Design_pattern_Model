package org.外观模式;

public class GeneralSwitchFacade {
    private TV tv; private Light[] light=new Light[2];private  Fan fan;
    public  GeneralSwitchFacade(){

      fan=new Fan();

               tv =new TV();
        light[0]=new Light("zuo");
        light[1]=new Light("you");
    }
   public void on(){
        light[0].on();
        light[1].on();
        tv.on();
        fan.on();
   }
   public void off(){
        light[0].off();
        light[1].off();
        tv.off();
        fan.off();
   }
}
