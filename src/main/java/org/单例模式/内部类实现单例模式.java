package org.单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: 常兆海
 * @Description: 内部类的方式试下单例模式
 * @: 静态内部类
 * @1).: 本质上是利用类的加载机制来保证线程安全
 * @2).: 只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 * @DateTime: 2023/5/20 15:37
 **/
public class 内部类实现单例模式 {
    private static class SingletonHolder {
        private static  内部类实现单例模式 innerSinleton = new 内部类实现单例模式();
    }
//    private 内部类实现单例模式 (){}

    /****
     * @: 通过反射获取实例化对象
     * @如何防止反射破解单例模式:   在构造方法中判断是否已经存在实例化对象，如果存在则抛出异常
     * @针对： 饿汉模式，静态内部类可用这种解决方式。  懒汉模式不可用，因为懒汉模式是在调用时才实例化对象 无法防护
     */
    private 内部类实现单例模式(){
        if (SingletonHolder.innerSinleton != null) {
            throw new RuntimeException("单例模式不允许多个实例化对象");
        }
    }
    public static 内部类实现单例模式 getSingleton() {
        return SingletonHolder.innerSinleton;
    }

}

class 反射获取实例化{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //通过反射获取实例化对象
        Constructor<内部类实现单例模式> declaredConstructor = 内部类实现单例模式.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);//设置权限
        内部类实现单例模式 singleton = declaredConstructor.newInstance();

        内部类实现单例模式 singleton1 = 内部类实现单例模式.getSingleton();
        System.out.println(singleton1 == singleton);//false

    }
}
