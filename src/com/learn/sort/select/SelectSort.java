package com.learn.sort.select;

/**
 * @Classname SelectSort
 * @Description TODO
 * @Date 2020/11/25 14:47
 * @Created by caibixiang
 */
public class SelectSort {

    /**
     * 选择排序
     * 遍历2次数组，每次从数组中选择一个最小的数(这里按照升序进行排列)
     * 时间复杂度O(n^2)
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        if (arr == null)
            return;
        int lg = arr.length;
        for (int i = 0; i < lg; i++) {
            int minIndex = i;
            for (int j = i; j < lg; j++) {
                if (arr[i] > arr[j])
                    minIndex = j;
            }
            if (i != minIndex)
                swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
