package com.对称字符串;

import java.util.Scanner;

/**
 * @author jiabing
 * @Package com.对称字符串
 * @Description: ${todo}
 * @date 2018/10/27 14:31
 */
public class 对称字符串_stringBuffer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sb1 = sc.nextLine();

        StringBuffer sb = new StringBuffer(sb1);

        String str = sb.reverse().toString();

        if(sb1.equals(str)==true){
            System.out.println("是对称的");
        }else{
            System.out.println("是不对称的");
        }
    }


}