package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguaya
 * @Date: 2018/12/1
 * @Description: 正方形类
 */
public class Square implements Shape {
    /**
     * 画正方形方法
     */
    @Override
    public void draw() {
        System.out.println("Draw a square");
    }
}
