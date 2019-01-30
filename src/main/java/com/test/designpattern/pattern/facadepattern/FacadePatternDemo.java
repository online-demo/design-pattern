package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: 测试类
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.makeLenovo();
        computerFacade.makeASUS();
        computerFacade.makeMacBook();
    }
}
