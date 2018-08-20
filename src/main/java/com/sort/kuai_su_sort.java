package com.sort;

import java.util.Arrays;

/**
 * @author jiabing
 * @Package com.sort
 * @Description: ${todo}
 * @date 2018/8/20 13:44
 */
public class kuai_su_sort {

    public static void main(String[] args) {
        //初始数组
        int[] arr = {2,5,3,1,9,6,4,8,7,0};
        sort(arr,arr.length-1,0);

        System.out.println(Arrays.toString(arr));

    }


    public static void sort(int[] arr,int hi,int lo){

        if(lo<hi){
            int index = quickSort(arr, hi, lo);
            //前部分
            sort(arr,index-1,lo);
            //后部分
            sort(arr,hi,index+1);
        }

    }

    /**
     * 快速排序
     * @param arr
     * @param hi
     * @param lo
     * @return
     */
    public static int quickSort(int[] arr,int hi,int lo){

        int key = arr[lo];
        while (lo<hi){
            //从后往前
            while (arr[hi]>=key && hi>lo){
                hi--;
            }
            arr[lo]=arr[hi];
            //从前往后
            while (arr[lo]<=key && hi>lo){
                lo++;
            }
            arr[hi] = arr[lo];
        }
        arr[hi] = key;

        return hi;
    }

}