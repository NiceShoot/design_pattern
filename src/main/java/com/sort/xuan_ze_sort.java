package com.sort;

import java.util.Arrays;

/**
 * @author jiabing
 * @Package com.sort
 * @Description: 简单选择排序
 * @date 2018/8/17 15:38
 */
public class xuan_ze_sort {

    public static void main(String[] args) {
        //初始数组
        int[] arr = {2,5,3,1,9,6,4,8,7,0};
        //排序
        for(int i=0;i<arr.length-1;i++){
            //假定 最小的值 的索引下标为  i
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}