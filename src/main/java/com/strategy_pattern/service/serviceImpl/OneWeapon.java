package com.strategy_pattern.service.serviceImpl;

import com.strategy_pattern.service.Weapon;

/**
 * @author jiabing
 * @Package com.strategy_pattern.service.serviceImpl
 * @Description: ${todo}
 * @date 2018/6/12 16:23
 */
public class OneWeapon implements Weapon {

    @Override
    public void gun() {
        System.out.println("切换AMW狙击枪");
    }
}
