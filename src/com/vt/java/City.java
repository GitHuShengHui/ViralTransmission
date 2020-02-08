package com.vt.java;

/**
 * 定义一个城市
 * @author Hero
 * @create 2020-02-08-13:09
 */
public class City {
    private int centerX;
    private int centerY;

    public City(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }
}

