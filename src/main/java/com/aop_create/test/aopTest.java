package com.aop_create.test;

import com.aop_create.MyAspect;
import com.aop_create.MyBeanFactory;
import com.aop_create.service.UserService;
import com.aop_create.service.serviceImpl.userServiceImpl;

/**
 * @author jiabing
 * @Package com.aop_create
 * @Description: ${todo}
 * @date 2018/8/6 14:54
 */
public class aopTest {

    public static void main(String[] args) {
        MyAspect myAspect = new MyAspect();
        UserService userService = new userServiceImpl();

        MyBeanFactory myBeanFactory = new MyBeanFactory(userService,myAspect);

        UserService service = (UserService)myBeanFactory.createService();

        service.addUser();
        service.updateUser();
        service.deleteUser();

    }

}