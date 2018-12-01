package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: 三角形类
 */
public class Triangle implements Shape {
    /**
     * 画三角形方法
     */
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }
}
