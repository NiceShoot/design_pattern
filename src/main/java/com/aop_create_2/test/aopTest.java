package com.aop_create_2.test;


import com.aop_create_2.MyAspect;
import com.aop_create_2.MyBeanFactory;
import com.aop_create_2.service.serviceImpl.userServiceImpl;

/**
 * @author jiabing
 * @Package com.aop_create
 * @Description: ${todo}
 * @date 2018/8/6 14:54
 */
public class aopTest {

    public static void main(String[] args) {
        MyAspect myAspect = new MyAspect();
        userServiceImpl userService = new userServiceImpl();

        MyBeanFactory myBeanFactory = new MyBeanFactory(userService,myAspect);

        userServiceImpl service = (userServiceImpl)myBeanFactory.getProxyInstance();

        service.addUser();
        /*service.updateUser();
        service.deleteUser();*/

    }

}