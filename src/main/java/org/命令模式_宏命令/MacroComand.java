package org.命令模式_宏命令;

import java.util.ArrayList;

public class MacroComand extends Command{
    private ArrayList<Command> commands=new ArrayList<>();
    @Override
    void addCommand(Command command) {
       commands.add(command);
    }

    @Override
    void removeCommand(Command command) {
       commands.remove(command);
    }

    @Override
    void getCommand(int i) {
        commands.get(i);
    }

    @Override
    void excute() {
        for (Object o:commands){
            ((Command)o).excute();
        }
    }
}
