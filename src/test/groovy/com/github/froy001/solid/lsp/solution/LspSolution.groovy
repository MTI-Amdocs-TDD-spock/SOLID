package com.github.froy001.solid.lsp.solution

import spock.lang.Specification

class LspSolution extends Specification{
    def "Classes using HasArea should not care about interface implementation"(){

        given:"A Rectangle and a Square"
        def rectangle = new Rectangle()
        def square = new Square()

        and:"This test is the class using a HasArea"

        when:"we set rectangle width to 2 and height to 3"
        rectangle.setWidth(2)
        rectangle.setHeight(3)

        and: "we set square size to 2"
        square.setSize(2)

        then:"rectangle area should equal 6"
        rectangle.calculateArea() == 6

        and:"square area should equal 4"
        square.calculateArea() == 4
    }
}
