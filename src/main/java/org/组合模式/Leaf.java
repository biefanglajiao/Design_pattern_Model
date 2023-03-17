package org.组合模式;

public class Leaf extends AbstractElement {//叶子节点
    @Override
    public   void add(AbstractElement element) {
        System.out.println("error");
    }

    @Override
    public    void remove(AbstractElement element) {
        System.out.println("error");
    }

    @Override
    public    AbstractElement getchild(int i) {
        System.out.println("error");
        return null;
    }

    @Override
    public    void operation() {
        System.out.println("文件 正在杀毒】");
    }
}
