package com.github.froy001.solid.lsp.solution;

public class Rectangle implements HasArea {

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea(){
        return getHeight() * getWidth();
    }

}
