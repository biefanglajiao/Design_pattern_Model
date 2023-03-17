package org.组合模式;

import java.util.ArrayList;

public class Composite1 extends AbstractElement1{
    private ArrayList list = new ArrayList();


    public void add(AbstractElement1 element) {
        list.add(element);
    }


    public void remove(AbstractElement1 element) {
        list.remove(element);
    }


    public AbstractElement getchild(int i) {
        return (AbstractElement) list.get(i);


    }

    @Override
    public void operation() {
//递归遍历节点
        for (Object o : list
        ) {
//            System.out.println(o+"正在杀毒");
            ((AbstractElement1) o).operation();

        }
    }
}
