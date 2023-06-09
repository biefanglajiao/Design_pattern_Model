package org.单例模式;

public class Singleton2 {
    //懒汉单例模式  在需要时才加载 多线程可能有问题  解决方案  加锁

    private static Singleton2 singleton2 = null;

    private Singleton2() {
    }


    /****
     *  @描述： 对整个方法加锁， 可能会导致效率低下，因为每次调用方法都要加锁，但实际上只有为空判断时才需要加锁
     *  @解决： 所以可以对判断为空的代码块加锁=》getSingleton22
     * @return
     */
    synchronized public static Singleton2 getSingleton21() {
        if (singleton2 == null)
            singleton2 = new Singleton2();
        return singleton2;
    }

    /**
     * @： synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种：
     * @：　1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象；
     * @：　2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象；
     * @：　3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象；
     * @： 4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。
     */

    /**
     * @描述： 对判断为空的代码块加锁
     * @存在问题： 如果两个方法都通过了第一个判断，但是还没有执行第二个判断，这时进程上锁，再new完一个实例以后，还会new第二个实例
     * @解决： 双重判断=》见Singleton3.class
     * @return
     */
    public static Singleton2 getSingleton22() {
        if (singleton2 == null)
            synchronized (Singleton2.class) {
                singleton2 = new Singleton2();
            }
        return singleton2;
    }


}
