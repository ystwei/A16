package com.weikun.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/13.
 */
@Component("myaxe")
public class SteelAxe implements Axe  {

    public void chop() {
        System.out.println("钢斧砍柴真快！");

    }
}
