package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: Lenovo电脑类
 */
public class Lenovo implements Computer {
    /**
     * 画圆形的方法
     */
    @Override
    public void make() {
        System.out.println("produce a Lenovo Computer");
    }
}
