import org.junit.Test;
import org.桥接模式.Color;
import org.桥接模式.Pen;
import org.桥接模式.XmlUtilPen;

public class 桥接模式 {
    @Test
    public void aVoid()
    {
        Color color;
        Pen pen;
        color= (Color) XmlUtilPen.getbBean("color");
        pen= (Pen) XmlUtilPen.getbBean("pen");
        pen.setColor(color);
        pen.draw("flower");
    }
    @Test
    public void  aVoid1() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Color color;
        Pen pen;
        Class c=Class.forName("org.桥接模式.Red");
        Object o1=c.newInstance();
        color= (Color) o1;
        Class c1=Class.forName("org.桥接模式.SmallPen");
        Object o2=c1.newInstance();
        pen= (Pen) o2;
        pen.setColor(color);
        pen.draw("tree");
    }
}
