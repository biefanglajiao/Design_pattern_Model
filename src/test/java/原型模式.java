import org.junit.Test;
import org.原型模式.Email;
import org.原型模式.Email1;

import java.io.IOException;

public class 原型模式 {
    @Test
    public void 浅克隆(){
        Email email,copyEmail;
        email=new Email();
        copyEmail= (Email) email.clone();


        System.out.println(email==copyEmail);
        System.out.println(email.getAttcchmentl()==copyEmail.getAttcchmentl());
    }

    @Test
    public void 深克隆() throws IOException, ClassNotFoundException {
        Email1 email1,copyEmail1;
        email1=new Email1();
        copyEmail1= (Email1) email1.deepClone();


        System.out.println(email1==copyEmail1);
        System.out.println(email1.getAttcchment()==copyEmail1.getAttcchment());
    }

}
