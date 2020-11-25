package com.learn.sort;

/**
 * @Classname SortTestHelper
 * @Description TODO
 * @Date 2020/11/9 14:16
 * @Created by caibixiang
 */
public class SortTestHelper {

    // SortTestHelper不允许产生任何实例
    private SortTestHelper() {
    }

    // 生成有n个元素的随机数组,每个元素的随机范围为[rangeL, rangeR]
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {

        assert rangeL <= rangeR;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = new Integer((int) (Math.random() * (rangeR - rangeL + 1) + rangeL));
        return arr;
    }

    // 打印arr数组的所有内容
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();

        return;
    }


    public static void isSorted(Comparable arr[]) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(arr[i - 1]) <0)
                throw new IllegalArgumentException("array is not sorted");
    }

}
