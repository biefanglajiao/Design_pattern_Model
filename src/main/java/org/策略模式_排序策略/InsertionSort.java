package org.策略模式_排序策略;

/**
 * @Author: 常兆海
 * @Description:    插入排序
 * @DateTime: 2023/4/7 10:46
 *
 **/
public class InsertionSort implements  Sort{
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
