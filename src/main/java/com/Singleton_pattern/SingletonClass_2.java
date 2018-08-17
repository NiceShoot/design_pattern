package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 饱汉式
 * @date 2018/8/17 13:24
 */
public class SingletonClass_2 {


    private void SingletonClass_2(){}

    private SingletonClass_2 singletonClass_2 = null;

    public SingletonClass_2 getSingletonClass_2(){
        if (singletonClass_2==null){
            singletonClass_2 = new SingletonClass_2();
        }
        return singletonClass_2;
    }



}