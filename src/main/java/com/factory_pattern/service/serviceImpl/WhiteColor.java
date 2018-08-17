package com.factory_pattern.service.serviceImpl;

import com.factory_pattern.service.Color;

/**
 * @author jiabing
 * @Package com.factory_pattern.service.serviceImpl
 * @Description: ${todo}
 * @date 2018/6/12 17:11
 */
public class WhiteColor implements Color {
    @Override
    public void getColor() {
        System.out.println("White Color");
    }
}
