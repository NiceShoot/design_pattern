package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: ${todo}
 * @date 2018/12/12 15:00
 */
public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return SingletonDemo6.INSTANCE.getInstance();
    }

    private static enum SingletonDemo6 {
        INSTANCE;
        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private SingletonDemo6() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }

}