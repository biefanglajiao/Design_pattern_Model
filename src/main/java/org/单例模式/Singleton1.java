package org.单例模式;

/****
 * @饿汉模式:  类加载的初始化阶段就完成了实例的初始化。本质上就是借助于jvm类加载机制，保证实例的唯一性。
 * @类加载过程: 加载->连接(验证->准备->解析)->初始化->使用->卸载
 * @1，: 加载二进制数据到内存中，生成对应的Class数据结构，
 * @2，: 连接: a.验证，b.准备(给类的静态成员变量赋默认值)，c.解析
 * @3，: 初始化:给类的静态变量赋初值
 * @: 只有在真正使用对应的类时，才会触发初始化如（当前类是启动类即main函数所在类，直接进行new操作﹐访问静态属性，访问静态方法，使用反射访问类，初始化一个类的子类等。）
 * @举例: Runtime
 */
public class Singleton1 {
    //饿汉单例模式  编译时加载  无线程问题
    //基于jvm类加载机制  保证线程安全
    private static  Singleton1 singleton=new Singleton1();
    private Singleton1(){}

    public  static  Singleton1 getSingleton(){
        return  singleton;
    }
}
