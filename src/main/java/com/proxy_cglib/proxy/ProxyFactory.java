package com.proxy_cglib.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jiabing
 * @Package com.proxy_cglib.proxy
 * @Description: ${todo}
 * @date 2018/6/12 18:27
 */
public class ProxyFactory implements MethodInterceptor {


    //目标对象
    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    //创建代理对象
    public Object getProxyInstance(){

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(object.getClass());

        enhancer.setCallback(this);

        return enhancer.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(object, objects);
        return invoke;
    }
}
