package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 静态内部类
 * @date 2018/8/17 13:44
 */
public class SingletonClass_5 {

    private void SingletonClass_5(){}

    private static class getSingle{
        private final static SingletonClass_5 singletonClass_5 = new SingletonClass_5();
    }

    public SingletonClass_5 getSingletonClass_5(){

        SingletonClass_5 singletonClass_5 = getSingle.singletonClass_5;

        return singletonClass_5;
    }

}