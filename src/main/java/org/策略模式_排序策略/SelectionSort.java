package org.策略模式_排序策略;

/**
 * @Author: 常兆海
 * @Description:    选择排序
 * @DateTime: 2023/4/7 10:46
 *
 **/
public class SelectionSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
}
