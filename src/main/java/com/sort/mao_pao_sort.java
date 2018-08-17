package com.sort;

import java.util.Arrays;

/**
 * @author jiabing
 * @Package com.sort
 * @Description:
 * @date 2018/8/17 15:27
 */
public class mao_pao_sort {

    public static void main(String[] args) {

        int[] arr = {2,5,3,1,9,6,4,8,7,0};
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length-1;j++){

                if(arr[i]>arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}