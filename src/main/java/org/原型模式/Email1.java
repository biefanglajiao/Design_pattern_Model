package org.原型模式;

import java.io.*;

public class Email1 implements Serializable {
    private Attcchment1 attcchment=null;

    public Email1(){
        this.attcchment=new Attcchment1();

    }


    public Object deepClone() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (ois.readObject());

    }


    public Attcchment1 getAttcchment() {
        return attcchment;
    }
}
