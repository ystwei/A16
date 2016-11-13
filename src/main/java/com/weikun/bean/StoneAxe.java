package com.weikun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/13.
 */
@Component
public class StoneAxe implements Axe {
    public void chop() {
        System.out.println("石斧砍柴真慢！");

    }
}
