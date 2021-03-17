package uaslp.ingenieria.labs.shapes.triangle;

import uaslp.ingenieria.labs.shapes.Triangle;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    public String getName(){
        return "Equilateral Triangle";
    }


    public float getPerimeter() {
        return base*3;
    }


    public float getArea() {
        return base*height/2;
    }

    public String getData() {
        return "Cuenta con una base de " + base + "cm y " +
                "una altura de " + height + "cm";
    }
}
