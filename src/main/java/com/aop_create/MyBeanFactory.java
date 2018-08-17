package com.aop_create;

import com.aop_create.service.serviceImpl.userServiceImpl;
import com.aop_create.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jiabing
 * @Package com.aop_create
 * @Description: 代理类
 * @date 2018/8/6 15:01
 */
public class MyBeanFactory {
    //目标类
    private  UserService userService;
    //切面类
    private MyAspect myAspect;

    public MyBeanFactory(UserService userService, MyAspect myAspect) {
        this.userService = userService;
        this.myAspect = myAspect;
    }

    public Object createService(){

        Object o =  Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println(method.getName());
                        myAspect.before();
                        Object invoke = method.invoke(userService, args);
                        myAspect.after();
                        System.out.println("-----------------------------------------------");
                        return invoke;
                }
                });

        return  o;
    }

}