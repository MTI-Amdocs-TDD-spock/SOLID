package com.github.froy001.solid.lsp.solution;

public class Square implements HasArea{

    private int size;

    public int calculateArea(){
        return getSize() * getSize();
    }

    public int getSize(){
        return this.size;

    }

    public void setSize(int size){
        this.size = size;
    }

}
