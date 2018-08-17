package com.strategy_pattern;

import com.strategy_pattern.service.serviceImpl.OneWeapon;
import com.strategy_pattern.service.serviceImpl.ThreeWeapon;
import com.strategy_pattern.service.serviceImpl.TowWeapon;

/**
 * @author jiabing
 * @Package com.strategy_pattern
 * @Description: 策略模式
 * @date 2018/6/12 16:20
 */
public class Controller {


    public static void main(String[] args) {

        Context context = new Context();

        System.out.println("游戏开始：");
        System.out.println("前方100米有敌人");
        context.setWeapon(new OneWeapon());
        context.getGun();
        System.out.println("左方10米有敌人");
        context.setWeapon(new ThreeWeapon());
        context.getGun();
        System.out.println("左方1米有敌人");
        context.setWeapon(new TowWeapon());
        context.getGun();
        System.out.println("游戏结束。");
    }


}
