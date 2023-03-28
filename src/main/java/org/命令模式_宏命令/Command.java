package org.命令模式_宏命令;

public abstract class Command {
    void addCommand(Command command){};
    void  removeCommand(Command command){};
   void getCommand(int i){};
   void  excute(){};
}
