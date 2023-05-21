import org.junit.Test;
import org.单例模式.Singleton;
import org.单例模式.Singleton2;
import org.单例模式.Singleton3;

public class 单例模式 {
    @Test
    public void aa() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2 == singleton1);


        Singleton2 singleton21 = Singleton2.getSingleton21();
        Singleton2 singleton22 = Singleton2.getSingleton21();
        System.out.println(singleton21 == singleton22);
        Singleton2 singleton23 = Singleton2.getSingleton22();
        Singleton2 singleton24 = Singleton2.getSingleton22();
        System.out.println(singleton23 == singleton24);

        Singleton3 singleton3 = Singleton3.getSingleton23();
        Singleton3 singleton4 = Singleton3.getSingleton23();
        System.out.println(singleton3 == singleton4);

    }

    /*****************
     *
     * @描述： 多线程懒汉单例模式 会出现两个进程同时进入if (singleton==null)  singleton=new Singleton();  会出现两个对象
     */
    @Test
    public void 多线程单例模式(){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Singleton singleton1 = Singleton.getSingleton();
                Singleton singleton2 = Singleton.getSingleton();
                System.out.println(singleton2 == singleton1);
            }).start();
        }
    }


}
