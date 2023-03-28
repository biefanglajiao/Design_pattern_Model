package org.命令模式_撤销操作;

public  interface Command {
   int execute(int value);
   int undo();

}
