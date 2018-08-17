package com.sort;

import java.util.Arrays;

/**
 * @author jiabing
 * @Package com.sort
 * @Description: 插入排序
 * @date 2018/8/17 15:57
 */
public class cha_ru_sort {


    public static void main(String[] args) {

        int[] arr = {2,5,3,1,9,6,4,8,7,0};

        //把数组分两部分。
        // 一个一个拿过来然后排序
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}