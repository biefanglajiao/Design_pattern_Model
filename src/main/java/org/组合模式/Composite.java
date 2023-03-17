package org.组合模式;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Composite extends AbstractElement {//容器节点
    private ArrayList list = new ArrayList();

    @Override
    public void add(AbstractElement element) {
        list.add(element);
    }

    @Override
    public void remove(AbstractElement element) {
        list.remove(element);
    }

    @Override
    public AbstractElement getchild(int i) {
        return (AbstractElement) list.get(i);


    }

    @Override
    public void operation() {
//递归遍历节点
        for (Object o : list
        ) {
//            System.out.println(o+"正在杀毒");
            ((AbstractElement) o).operation();

        }
    }
}
