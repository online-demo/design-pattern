package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: 三角形类
 */
public class MacBook implements Computer {
    /**
     * 画三角形方法
     */
    @Override
    public void make() {
        System.out.println("produce a MacBook Computer");
    }
}
