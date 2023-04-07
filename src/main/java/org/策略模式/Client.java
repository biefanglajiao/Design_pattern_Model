package org.策略模式;

/**
 * @Author: 常兆海
 * @Description: 策略模式  可采用sql注入的方式来选择不同的算法
 * @DateTime: 2023/4/7 9:19
 *
 **/
public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        Absreactstrategy absreactstrategy= new AbsreactstrategyA();
        context.setStrategy(absreactstrategy);
        context.algorithm();
    }
}
