package org.普通工厂;

public class WorkFactory {

    public static  Iwork workfactory(String brend)throws  Exception{
        Iwork iwork;
        switch (brend){
            case  "phone" :
                   iwork= new  Phone(); break;
            case  "mouthmask":
                iwork=new MouthMask();break;
            default: throw new Exception("错误啦");
        }

        return iwork;
    }
}
