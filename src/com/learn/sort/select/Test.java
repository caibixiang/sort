package com.learn.sort.select;

import com.learn.sort.SortTestHelper;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/11/25 15:00
 * @Created by caibixiang
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = SortTestHelper.generateRandomArray(1000, 1, 100000);
        System.out.print("选择排序前: \n");
        SortTestHelper.printArray(arr);
        SelectSort.sort(arr);//校验有序性
        System.out.print("选择排序后: \n");
        SortTestHelper.printArray(arr);
    }


}
