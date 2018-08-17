package com.decorator_pattern;

import com.decorator_pattern.service.Duck;
import com.decorator_pattern.service.GreenDuck;
import com.decorator_pattern.service.RedDuck;

/**
 * @author jiabing
 * @Package com.decorator_pattern
 * @Description: 装饰者模式
 * @date 2018/6/12 10:12
 */
public class Controller {


    public static void main(String[] args) {

        Duck redDuck = new RedDuck();
        redDuck.type();

        Duck greenDuck = new GreenDuck();
        greenDuck.type();

    }

}
