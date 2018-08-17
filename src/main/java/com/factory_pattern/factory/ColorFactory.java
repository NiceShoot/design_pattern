package com.factory_pattern.factory;

import com.factory_pattern.service.Color;
import com.factory_pattern.service.serviceImpl.GreenColor;
import com.factory_pattern.service.serviceImpl.RedColor;
import com.factory_pattern.service.serviceImpl.WhiteColor;

/**
 * @author jiabing
 * @Package com.factory_pattern.factory
 * @Description: ${todo}
 * @date 2018/6/12 17:12
 */
public class ColorFactory {


    public Color getColor(String color){

        if(color == null){
            return null;
        }
        if(color.equals("Red")){
            return new RedColor();
        }
        if(color.equals("Green")){
            return new GreenColor();
        }
        if(color.equals("White")){
            return new WhiteColor();
        }
        return null;
    }



}
