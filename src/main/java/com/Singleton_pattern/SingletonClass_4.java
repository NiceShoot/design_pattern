package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 双重检验锁  推荐
 * @date 2018/8/17 13:41
 */
public class SingletonClass_4 {

    private SingletonClass_4() {
    }

    private SingletonClass_4 singletonClass_4 = null;

    public SingletonClass_4 getSingletonClass_4(){

        if(singletonClass_4 == null){
            synchronized (SingletonClass_4.class){
                if(singletonClass_4 == null){
                    singletonClass_4 = new SingletonClass_4();
                }
            }
        }
        return singletonClass_4;
    }

}