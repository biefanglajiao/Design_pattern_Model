package org.迭代器模式_电视机遥控器;

public class Client {
    public static void main(String[] args) {
TV tv;
tv= (TV) Xmlutil.getbBean();
display(tv);
predisplay(tv);
    }

    public static void display(TV tv){
        TVIterator tvIterator= tv.createIterator();
        System.out.println("电视机频道：");
        while (!tvIterator.isLast()){
            System.out.println(tvIterator.currentChannel().toString());
            tvIterator.next();
        }
    }

    public static void predisplay(TV tv){
        TVIterator tvIterator=tv.createIterator();
        System.out.println("逆序电视机频道");
        tvIterator.setChannel(tvIterator.longer());
        while (!tvIterator.isFirst()){
            tvIterator.previous();
            System.out.println(tvIterator.currentChannel().toString());
        }
    }
}
