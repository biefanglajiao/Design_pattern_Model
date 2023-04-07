package org.迭代器模式_常规;

public  interface Iterator {
   void first();//获取第一个元素
   void  next();//访问下一个元素
   boolean hasNext();//是否有下一个元素
  Object currentltem();//获取当前元素

}
