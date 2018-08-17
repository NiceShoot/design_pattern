package com.static_proxy.service;

/**
 * @author jiabing
 * @Package com.static_proxy.service
 * @Description: ${todo}
 * @date 2018/6/12 17:37
 */
public class UserProxy implements userService {


    private userService userService;

    public UserProxy(com.static_proxy.service.userService userService) {
        this.userService = userService;
    }

    @Override
    public void getName() {
        userService.getName();
    }
}
