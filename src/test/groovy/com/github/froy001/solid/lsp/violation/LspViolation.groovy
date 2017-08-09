package com.github.froy001.solid.lsp.violation

import spock.lang.Specification

class LspViolation extends Specification{
    def "Classes using Rectangle should not care about subclasses of Rectangle"(){

        given:"A Rectangle and a Square"
        def rectangle1 = new Rectangle()
        def rectangle2 = new Square()

        and:"This test is the class using a Rectangle"

        when:"we set rectangle1 width to 2 and length to 3"
        rectangle1.setLength(2)
        rectangle1.setWidth(3)

        and: "we set rectangle2 width to 2 and length to 3"
        rectangle2.setLength(2)
        rectangle2.setWidth(3)

        then:"rectangle1 area should equal width * length = 6"
        rectangle1.area == 6

        and:"rectangle2 area should equal width * length = 6"
        rectangle2.area == 6

    }
}
