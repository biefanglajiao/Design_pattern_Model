package org.单例模式;

/*****
 * @懒汉模式: 延迟加载，只有在真正使用的时候，才开始实例化。
 * @1）: 线程安全问题
 * @2): double check 加锁优化
 * @3）: 编译器(JIT),CPU有可能对指令进行重排序，导致使用到尚未初始化的实例，可以通过添加volatile关键字进行修饰, 对于volatile修饰的字段，可以防止指令重排。
 */
public class Singleton3 {
    //懒汉单例模式  在需要时才加载 多线程可能有问题


    /**
     *
     * 双重加锁
     */

    private  volatile static   Singleton3 singleton3=null;
    private Singleton3(){}

    /***
     * @描述：  通过双重加锁，完美解决多线程问题
     * @return
     */
    public static Singleton3 getSingleton23(){
        if (singleton3==null)
            synchronized (Singleton3.class) {
                if (singleton3==null)
                    singleton3 = new Singleton3();
                //字节码层
                //1、分配空间
                //2、初始化
                //3、引用赋值
                // JIT（即时编译）、cpu、编译器等  可能会导致指令重排（多线程）
                // 此时2、3、顺序可能会改变，但是单线程模式不受影响
                // 比如线程一执行顺序1、3、2 执行到3，此时线程二进入，判断singleton3不为空，直接返回，但是此时singleton3还没有初始化，就会出错 报空指针异常
                //解决：   volatile  关键字  禁止指令重排
            }
        return singleton3;
    }

}
