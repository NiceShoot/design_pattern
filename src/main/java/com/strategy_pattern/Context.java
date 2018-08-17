package com.strategy_pattern;

import com.strategy_pattern.service.Weapon;

/**
 * @author jiabing
 * @Package com.strategy_pattern
 * @Description: 策略模式
 * @date 2018/6/12 16:29
 */
public class Context {

    Weapon weapon;

    public Context() {
    }

    public Context(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void getGun(){
        weapon.gun();
    }



}
