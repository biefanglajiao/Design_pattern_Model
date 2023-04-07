package org.策略模式_旅游出行策略;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:39
 *
 **/
public class TrainStrategy implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("坐火车");
    }

}
