package com.sort;

import java.util.Arrays;

/**
 * @author jiabing
 * @Package com.sort
 * @Description: 希尔排序
 * @date 2018/8/17 16:05
 */
public class xi_er_sort {


    public static void main(String[] args) {
        //初始数组
        int[] arr = {2,5,3,1,9,6,4,8,7,0};

        //取d1（通常为 n/2） 按d1 长度分组。 直到 dk = 1
        int dk = arr.length / 2;
        while (dk>=1){
            for(int i=dk;i<arr.length;i++){
                int j=i;
                System.out.println("j-dk="+(j-dk)+":::::j="+j+"::::dk="+dk+":::arr[j]="+arr[j]+":::arr[j-dk]="+arr[j-dk]);
                //从j=dk 开始， j 和 j-dk 比较。并变换位置，j 递增
                while (j>=dk && arr[j]<arr[j-dk]){
                    System.out.println("while循环===j-dk="+(j-dk)+":::::j="+j+"::::dk="+dk+":::arr[j]="+arr[j]+":::arr[j-dk]="+arr[j-dk]);
                    int temp = arr[j];
                    arr[j] = arr[j-dk];
                    arr[j-dk] = temp;
                    j -= dk;
                }
            }
            dk = dk/2;
            System.out.println("----------------------------------");
        }
        System.out.println(Arrays.toString(arr));
    }

}