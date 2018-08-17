package com.aop_create_2;

import com.aop_create_2.service.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiabing
 * @Package com.aop_create
 * @Description: 代理类
 * @date 2018/8/6 15:01
 */
public class MyBeanFactory implements MethodInterceptor {
    //目标类
    private Object service;
    //切面类
    private MyAspect myAspect;

    public MyBeanFactory(Object service, MyAspect myAspect) {
        this.service = service;
        this.myAspect = myAspect;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(service.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        myAspect.before();
        Object invoke = method.invoke(service, objects);
        myAspect.after();
        return invoke;
    }


}