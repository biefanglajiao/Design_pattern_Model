package 代理模式;

public class RealSubject extends Subject{
    @Override
    public void requset() {
        System.out.println("request");
    }
}
