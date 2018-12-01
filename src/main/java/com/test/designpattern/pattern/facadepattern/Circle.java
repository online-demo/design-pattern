package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: 原型类
 */
public class Circle implements Shape {
    /**
     * 画圆形的方法
     */
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
