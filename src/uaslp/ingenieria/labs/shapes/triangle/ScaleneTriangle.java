package uaslp.ingenieria.labs.shapes.triangle;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    private float hypotenuse;

    public ScaleneTriangle(float base, float height, float hypotenuse){
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public String getName(){
        return "Scalene Triangle";
    }


    public float getPerimeter() {
        return base + height + hypotenuse;
    }

    public float getArea() {
        return base*height/2;
    }

    public String getData() {
        return "Cuenta con una base de " + base + "cm, " +
                "una altura de " + height + "cm y " +
                "una hipotenusa de " +hypotenuse ;
    }
}
