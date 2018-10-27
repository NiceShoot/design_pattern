package com.对称字符串;

import java.util.Scanner;

/**
 * @author jiabing
 * @Package com.对称字符串
 * @Description: ${todo}
 * @date 2018/10/27 14:31
 */
public class 对称字符串_遍历 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sb1 = sc.nextLine();

        StringBuffer sb = new StringBuffer(sb1);

        String str = sb.toString();
        char[] chars = str.toCharArray();
        int x = 0;
        int y = chars.length-1;
        while (chars[x++] == chars[y--]){
            if(chars[x] != chars[y]){
                System.out.println("不对称");
                break;
            }
            if(x>y){
                System.out.println("对称");
                break;
            }
        }
    }


}