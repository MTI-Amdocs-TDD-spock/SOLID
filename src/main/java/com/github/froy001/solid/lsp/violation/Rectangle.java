package com.github.froy001.solid.lsp.violation;

public class Rectangle {

    private int length;
    private int width;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea() {
        return this.length * this.width;
    }
}
