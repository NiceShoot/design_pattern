package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 加同步方法   不推荐
 * @date 2018/8/17 13:27
 */
public class SingletonClass_3 {


    /**
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
     * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。
     * 方法进行同步效率太低要改进。
     */

    private void SingletonClass_3(){}

    private SingletonClass_3 singletonClass_3 = null;

    public synchronized SingletonClass_3 getSingletonClass_3(){
        if(singletonClass_3 == null){
            singletonClass_3 = new SingletonClass_3();
        }
        return singletonClass_3;
    }


}