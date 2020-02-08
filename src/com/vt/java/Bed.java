package com.vt.java;

/**
 * 创建一个用于演示的医院的病床类
 * @author Hero
 * @create 2020-02-08-13:11
 */
public class Bed extends Point{
    public Bed(int x, int y) {
        super(x, y);
    }
    private boolean isEmpty=true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

