package org.组合模式;

public class Leaf1 extends AbstractElement1{
    //可以创好多种叶子类的节点代表不同的文件种类

    //安全组合模式  叶子节点没有那些错误的方法存在
    @Override
    public void operation() {
        System.out.println("XXX类节点正在杀毒");
    }
}
