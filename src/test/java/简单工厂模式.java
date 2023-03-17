import org.junit.Test;
import org.普通工厂.Iwork;
import org.普通工厂.Person;
import org.普通工厂.WorkFactory;

public class 简单工厂模式 {
@Test
    public void aa() throws Exception {
    Iwork iwork;
    iwork= WorkFactory.workfactory("phone");
    iwork.work();
}

@Test
    public void aaa()throws Exception{
    Person person=new Person();
person.setPerson("aaa");
    person.work();
}
}
