package org.策略模式_排序策略;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/4/7 10:47
 *
 **/
public class ArrayHander {
    private Sort sort;

    public int[] sort(int[] arr) {
        return sort.sort(arr);
    }



    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
