package com.observe_pattern_2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author jiabing
 * @Package com.observe_pattern_2
 * @Description: ${todo}
 * @date 2018/6/12 15:13
 */
public class Display implements Observer {

    private String name;

    private String message;

    public Display() {
    }

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        update(arg+"");
    }

    public void update(String message) {
        this.message = message;
        //接受消息
        printf();
    }

    public void printf(){
        System.out.println(name+"--接受到消息--"+message);
    }

}
