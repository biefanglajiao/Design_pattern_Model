package org.策略模式_旅游出行策略;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:38
 *
 **/
public class AirplaneStrategy
implements  TravelStrategy{
    @Override
    public void travel() {
        System.out.println("坐飞机");
    }
}
