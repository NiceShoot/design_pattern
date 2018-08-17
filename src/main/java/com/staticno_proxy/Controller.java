package com.staticno_proxy;

import com.staticno_proxy.factory.ProxyFactory;
import com.staticno_proxy.service.UserServiceImpl;
import com.staticno_proxy.service.userService;

/**
 * @author jiabing
 * @Package com.static_proxy
 * @Description: jdk 动态代理
 * @date 2018/6/12 17:34
 */
public class Controller {


    public static void main(String[] args) {
        userService userService = new UserServiceImpl();
        ProxyFactory factory = new ProxyFactory(userService);

        userService proxyInstance = (userService)factory.getProxyInstance();
        proxyInstance.getName();
    }

}
