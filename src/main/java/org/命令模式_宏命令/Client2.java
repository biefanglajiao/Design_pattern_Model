package org.命令模式_宏命令;

public class Client2 {
    public static void main(String[] args) {
        MacroComand command = new MacroComand();
        Invoke1 invoke1 = new Invoke1(command);
        invoke1.call();


    }
}
