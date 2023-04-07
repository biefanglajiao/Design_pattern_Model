package org.策略模式_旅游出行策略;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:39
 *
 **/
public class Client {
    public static void main(String[] args) {

        Person person = new Person();
       TravelStrategy tra= (TravelStrategy) Xmlutil.getbBean();
        person.setTravelStrategy(tra);
        person.travel();
    }
}
