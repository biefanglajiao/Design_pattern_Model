import org.junit.Test;
import org.组合模式.*;

public class 组合模式 {
    @Test
    public void  透明组合模式(){
        //文件夹folder
        //文件 file
        AbstractElement  foldermin,folder1,folder2,file1,file2,file3,file4;

        file1=new Leaf();
        file2=new Leaf();
        file3=new Leaf();
        file4 =new Leaf();

        foldermin= new Composite();
        folder1=new Composite();
        folder2 =new Composite();
        foldermin.add(folder1);
        foldermin.add(folder2);

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        foldermin.operation();

        System.out.println("错误示范");
        file4.add(file4);

    }
    @Test
    public void  安全组合模式(){
        //文件夹folder
        //文件 file
        Composite1 foldermin,folder1,folder2;
AbstractElement1 file1,file2,file3,file4;
        file1=new Leaf1();
        file2=new Leaf1();
        file3=new Leaf1();
        file4 =new Leaf1();

        foldermin= new Composite1();
        folder1=new Composite1();
        folder2 =new Composite1();


        foldermin.add(folder1);
        foldermin.add(folder2);

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        foldermin.operation();

      //  System.out.println("错误示范");
        //file4.add(file4);
//文件没有了添加方法
    }
}
