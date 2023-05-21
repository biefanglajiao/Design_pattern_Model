package org.单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/21 13:23
 **/
public enum 枚举类实现单例模式 {
    INSTANCE;

    public void p(){
        System.out.println(this.hashCode());
    }
}

/***
 * @: 枚举类实现单例模式
 * @1).: 本质上是利用类的加载机制来保证线程安全
 * @2).: 只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 * @3).: 由于 INSTANCE 枚举常量是在类加载时创建的，因此该单例对象是线程安全的。
 * @DateTime: 2023/5/20 15:37
 * @: 无法通过反射获取实例化对象
 *
 */
class 反射获取{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /****
         *
         */
        枚举类实现单例模式 instance1 = 枚举类实现单例模式.INSTANCE;
        枚举类实现单例模式 instance2 = 枚举类实现单例模式.INSTANCE;
        System.out.println(instance1 == instance2);//true




        /****
         * @: 通过反射获取实例化对象
         * @结果： 报错 Cannot reflectively create enum objects
         * @原因： 枚举类的构造方法是私有的，无法通过反射获取实例化对象
         */
        Constructor<枚举类实现单例模式> declaredConstructor = 枚举类实现单例模式.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        枚举类实现单例模式 instance = declaredConstructor.newInstance("INSTANCE",0);
    }
}