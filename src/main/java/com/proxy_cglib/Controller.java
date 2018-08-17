package com.proxy_cglib;

import com.proxy_cglib.proxy.ProxyFactory;
import com.proxy_cglib.userservice.userserviceImpl.UserServiceImpl;

/**
 * @author jiabing
 * @Package com.proxy_cglib
 * @Description: cglib 动态代理
 * @date 2018/6/12 18:22
 */
public class Controller {


    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        ProxyFactory factory = new ProxyFactory(userService);

        UserServiceImpl proxyInstance = (UserServiceImpl) factory.getProxyInstance();

        proxyInstance.getName();

    }

}
