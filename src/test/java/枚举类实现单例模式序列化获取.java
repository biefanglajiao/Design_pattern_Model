import org.junit.Test;
import org.单例模式.枚举类实现单例模式;

import java.io.*;

/**
 * @Author: 常兆海
 * @Description: 枚举类实现单例模式序列化获取
 * @DateTime: 2023/5/21 14:50
 * @: 枚举类型是天然支持序列化操作的 源码readObject。readObject0中对应的enum相应的操作
 **/


/**
 * @说明：
 * @1： 为什么枚举类序列化实例时不需要重写readResolve()方法
 * @： 在 Java 中，当一个类实现了 Serializable 接口时，它可以被序列化和反序列化。在序列化和反序列化期间，对象的状态将被转换为字节流，并且可以在网络上传输或存储到磁盘上。
 * @： 当一个枚举类实现了 Serializable 接口时，由于枚举常量是在类加载时创建的，因此枚举类的单例对象是固定不变的。这意味着在反序列化期间，JVM 只需从当前的运行时环境中返回枚举常量，而不需要创建新的枚举常量。
 * @： 因此，在使用枚举类实现单例模式时，由于枚举常量在类加载时就已经被创建并初始化了，所以在序列化和反序列化期间，JVM 会自动处理枚举常量的序列化和反序列化，并保证返回的对象引用和原始对象相同。
 * @： 简而言之，枚举类实现单例模式时不需要重写 readResolve() 方法，是因为枚举常量的序列化和反序列化都是由 JVM 自动处理的，不需要开发人员手动干预。
 *
 * @2： 为什么内部类实现单例模式类序列化实例时需要重写readResolve()方法
 * @： 内部类实现单例模式时，如果该类实现了 Serializable 接口并且在反序列化期间没有正确处理，则可能会破坏单例属性。即使在外部类已经正确地实现了单例模式，但是在反序列化后，仍然可以通过创建新的对象来绕过单例限制。
 * @：为了避免这种情况发生，需要重写 readResolve() 方法。该方法将在反序列化期间被 JVM 自动调用，以确保只返回单例对象的引用。
 * @：以下是示例代码：
 * @： java
 * @： public class Singleton implements Serializable {
 * @： private static final long serialVersionUID = 1L;
 *
 * @： private static class SingletonHelper {
 * @： private static final Singleton INSTANCE = new Singleton();
 * @：    }
 *
 *  @： public static Singleton getInstance() {
 *  @： return SingletonHelper.INSTANCE;
 *  @：  }
 *
 *  @： protected Object readResolve() {
 *  @： return getInstance();
 *  @：   }
 * @： }
 * @： 在这个示例中，Singleton 类使用一个静态内部类 SingletonHelper 来创建单例对象。readResolve() 方法返回 getInstance() 方法的结果，该方法返回 SingletonHelper.INSTANCE，以确保在反序列化后返回的是相同的单例对象。
 * @： 需要注意的是，如果 Singleton 类的构造函数具有参数，则需要在 readResolve() 方法中处理这些参数，并使用它们来返回正确的单例对象。否则，在反序列化后，单例对象的状态可能不正确，从而导致应用程序出现错误。
 */
public class 枚举类实现单例模式序列化获取 {
    枚举类实现单例模式 instance = 枚举类实现单例模式.INSTANCE;

    @Test
    public void 写() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("序列化3"));
        oos.writeObject(instance);
        oos.close();
    }

    @Test
    public void 读比() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("序列化3"));
        枚举类实现单例模式 read = ((枚举类实现单例模式) ois.readObject());
        System.out.println(instance == read);//true
    }
}