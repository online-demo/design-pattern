package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguaya
 * @Date: 2018/12/1
 * @Description: ASUS类
 */
public class ASUS implements Computer {
    /**
     * 画正方形方法
     */
    @Override
    public void make() {
        System.out.println("produce a ASUS Computer");
    }
}
