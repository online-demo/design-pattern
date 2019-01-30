package com.test.designpattern.pattern.facadepattern;

/**
 * @Author: zhouguanya
 * @Date: 2018/12/1
 * @Description: 门面
 */
public class ComputerFacade {
    private Computer lenovo;
    private Computer asus;
    private Computer macBook;
    public ComputerFacade() {
        lenovo = new Lenovo();
        asus = new ASUS();
        macBook = new MacBook();
    }
    public void makeLenovo(){
        lenovo.make();
    }
    public void makeASUS(){
        asus.make();
    }
    public void makeMacBook(){
        macBook.make();
    }
}
