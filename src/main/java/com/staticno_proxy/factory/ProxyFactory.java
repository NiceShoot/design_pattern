package com.staticno_proxy.factory;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiabing
 * @Package com.staticno_proxy.factory
 * @Description: ${todo}
 * @date 2018/6/12 17:49
 */
public class ProxyFactory {

    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance(){

        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Object invoke = method.invoke(object, args);

                        return invoke;
                    }
                });
    }

}
