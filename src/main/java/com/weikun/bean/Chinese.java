package com.weikun.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/13.
 */
@Scope("prototype")//singleton
@Component
public class Chinese implements  Person {
    @Autowired
    @Qualifier("stoneAxe")
    private Axe axe;



    public void useAxe() {
        this.axe.chop();
    }
}
