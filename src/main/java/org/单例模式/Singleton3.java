package org.单例模式;

public class Singleton3 {
    //懒汉单例模式  在需要时才加载 多线程可能有问题


    /**
     *
     * 双重加锁
     */

    private  volatile static   Singleton3 singleton3=null;
    private Singleton3(){}

    public static Singleton3 getSingleton23(){
        if (singleton3==null)
            synchronized (Singleton3.class) {
                if (singleton3==null)
                    singleton3 = new Singleton3();
            }
        return singleton3;
    }

}
