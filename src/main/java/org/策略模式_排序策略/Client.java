package org.策略模式_排序策略;

/**
 * @Author: 常兆海
 * @Description://乱序数组  通过策略模式  排序
 * @DateTime: 2023/4/7 10:49
 *
 **/
public class Client {
    //定义一个10以内的乱序数组
    public static int[] arr={1,2,3,4,5,6,7,8,9,0};
    public static void main(String[] args) {

        ArrayHander arrayHander=new ArrayHander();
        Sort sort= (Sort) Xmlutil.getbBean();
        arrayHander.setSort(sort);
        arrayHander.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
