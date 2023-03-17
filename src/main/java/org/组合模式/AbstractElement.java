package org.组合模式;

/***
 * 透明组合模式
 */
public abstract class AbstractElement {//抽象构件
public abstract    void  add(AbstractElement element);
public abstract  void  remove(AbstractElement element);
public abstract  AbstractElement getchild(int i);
public abstract void  operation();
}
