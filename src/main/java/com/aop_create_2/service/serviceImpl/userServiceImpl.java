package com.aop_create_2.service.serviceImpl;

import com.aop_create_2.service.UserService;

/**
 * @author jiabing
 * @Package com.aop_create.service.serviceImpl
 * @Description: 目标类实现
 * @date 2018/8/6 14:54
 */
public class userServiceImpl/* implements UserService */{

    public void addUser() {
        System.out.println("新增用户");
    }

    public void updateUser() {
        System.out.println("编辑用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }
}