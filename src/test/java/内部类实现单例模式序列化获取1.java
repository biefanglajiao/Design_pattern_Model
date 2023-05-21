import org.junit.Test;

import java.io.*;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/5/21 14:16
 **/
public class 内部类实现单例模式序列化获取1 {
    org.单例模式.内部类实现单例模式序列化获取1 instance= org.单例模式.内部类实现单例模式序列化获取1.getSingleton();
    @Test
    public void 写() throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("序列化2"));
        oos.writeObject(instance);
        oos.close();
    }

    @Test
    public  void 读比() throws IOException, ClassNotFoundException {
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("序列化2"));
        org.单例模式.内部类实现单例模式序列化获取1 read=((org.单例模式.内部类实现单例模式序列化获取1) ois.readObject());

        System.out.println(instance==read);//true
        /***
         * @解析：见原类文件。
         * 对枚举类也同样适用
         */

    }


}
