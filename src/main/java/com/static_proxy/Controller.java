package com.static_proxy;

import com.static_proxy.service.UserProxy;
import com.static_proxy.service.UserServiceImpl;
import com.static_proxy.service.userService;

/**
 * @author jiabing
 * @Package com.static_proxy
 * @Description: 静态代理
 * @date 2018/6/12 17:34
 */
public class Controller {

    static userService userService;

    public static void main(String[] args) {

        userService = new UserServiceImpl();

        UserProxy userProxy = new UserProxy(userService);

        userProxy.getName();
    }

}
