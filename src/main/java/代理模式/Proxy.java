package 代理模式;

public class Proxy extends Subject{
    private RealSubject realSubject=new RealSubject();
    public void pre(){
        System.out.println("pre");
    }
    public  void Post(){
        System.out.println("post");
    }

    @Override
    public void requset() {
        pre();
      realSubject.requset();
        Post();
    }
}
