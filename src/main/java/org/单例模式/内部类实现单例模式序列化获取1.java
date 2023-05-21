package org.单例模式;

import java.io.Serializable;

/**
 * @Author: 常兆海
 * @Description: 内部类的方式试下单例模式
 * @: 静态内部类
 * @1).: 本质上是利用类的加载机制来保证线程安全
 * @2).: 只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 * @: 通过反序列化获取实例化对象
 * @： 通过反序列话获取实例化对象不会调用我们定义的构造方法，有自己的序列化机制，从字节流中获取----jvm序列化机制
 * @结果： 通过反序列化获取的实例化对象和原来的实例化对象不是同一个对象
 * @思路： serializable接口中有一个readResolve()方法，会在反序列化时调用，这个方法可以让开发人员控制对象的反序列化。
 * @修要注意： 为了兼容性，要加一个版本号，否则（类文件有修改就）会报错--static final long serialVersionUID = 42L;
 * @原因： 如果不加版本号，序列化时jvm会根据你的类帮你生成一个版本号，并存到序列化后的文件中，反序列话时就会根据你的class再生成一个版本号与文件比对，一致则反序列化成功，不一致则报错；类有修改必失败。
 * @如何解决： 重写readResolve()方法---见下文
 * @举例： Currency--货币处理 (还有享元模式的例子，一个国家对应一个单例（货币）)
 * @DateTime: 2023/5/21 14:27
 **/
public class 内部类实现单例模式序列化获取1 implements Serializable {
    static final long serialVersionUID = 42L;//要加一个版本号，否则会报错
    private static class SingletonHolder {
        private static 内部类实现单例模式序列化获取1 innerSinleton = new 内部类实现单例模式序列化获取1();
    }
//    private 内部类实现单例模式 (){}

    /****
     * @: 通过反射获取实例化对象
     * @如何防止反射破解单例模式: 在构造方法中判断是否已经存在实例化对象，如果存在则抛出异常
     * @针对： 饿汉模式，静态内部类可用这种解决方式。  懒汉模式不可用，因为懒汉模式是在调用时才实例化对象 无法防护
     */
    private 内部类实现单例模式序列化获取1() {
        if (SingletonHolder.innerSinleton != null) {
            throw new RuntimeException("单例模式不允许多个实例化对象");
        }
    }

    public static 内部类实现单例模式序列化获取1 getSingleton() {
        return SingletonHolder.innerSinleton;
    }

    Object readResolve() {
        return SingletonHolder.innerSinleton;
    }
}
