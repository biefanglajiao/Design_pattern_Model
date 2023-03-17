package org.单例模式;

public class Singleton1 {
    //饿汉单例模式  编译时加载  无线程问题
    private static  Singleton1 singleton=new Singleton1();
    private Singleton1(){}

    public  static  Singleton1 getSingleton(){
        return  singleton;
    }
}
