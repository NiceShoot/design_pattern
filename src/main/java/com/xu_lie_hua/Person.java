package com.xu_lie_hua;

import java.io.Serializable;

/**
 * @author jiabing
 * @Package com.xu_lie_hua
 * @Description: ${todo}
 * @date 2018/8/21 16:23
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private String name;

    private String sex;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}