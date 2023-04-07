package org.状态模式;

public class Context {
   private State state;
     public void requset(){
         System.out.println("req");
         state.handle();
     }

    public void setState(State state) {this.state=state;
    }
}
