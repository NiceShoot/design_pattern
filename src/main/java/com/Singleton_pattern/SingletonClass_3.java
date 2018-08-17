package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 加锁
 * @date 2018/8/17 13:27
 */
public class SingletonClass_3 {


    private void SingletonClass_3(){}

    private SingletonClass_3 singletonClass_3 = null;

    public synchronized SingletonClass_3 getSingletonClass_3(){
        if(singletonClass_3 == null){
            singletonClass_3 = new SingletonClass_3();
        }
        return singletonClass_3;
    }


}