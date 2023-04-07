package org.策略模式_排序策略;

/**
 * @Author: 常兆海
 * @Description:    冒泡排序
 * @DateTime: 2023/4/7 10:45
 *
 **/
public class BubbleSort implements Sort{
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
