package com.github.froy001.solid.lsp.violation;

public class Square extends Rectangle {
    /**
     * Square class; Square inherits from Rectangle;
     * Represents ISA relationship - Square is a Rectangle
     */

    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(int length){
        super.setWidth(length);
        super.setLength(length);
    }
}
