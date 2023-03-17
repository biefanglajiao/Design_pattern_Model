package org.单例模式;

public class Singleton {
    //懒汉单例  需要是才加载
    private static  Singleton singleton=null;
    private Singleton(){}

    public  static  Singleton getSingleton(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return  singleton;
    }
}
