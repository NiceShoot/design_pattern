package com.factory_pattern;

import com.factory_pattern.factory.ColorFactory;

/**
 * @author jiabing
 * @Package com.factory_pattern
 * @Description: 工厂模式
 * @date 2018/6/12 17:05
 */
public class Controller {



    public static void main(String[] args) {

        ColorFactory factory = new ColorFactory();

        factory.getColor("Red").getColor();

        factory.getColor("Green").getColor();

        factory.getColor("White").getColor();


    }


}
