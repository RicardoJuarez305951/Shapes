package uaslp.ingenieria.labs.shapes.triangle;

import uaslp.ingenieria.labs.shapes.Triangle;


public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(float base, float side){
        this.base = base;
        this.height = side;
    }
    public String getName(){
        return "Isosceles Triangle";
    }


    public float getArea() {
        return (float) ((float) base *
                Math.sqrt( height * height - ((base * base) / 4) / 2));
    }


    public float getPerimeter() {
        return 2 * height + base;
    }

    public String getData() {
        return "Cuenta con una base de " + base + "cm y " +
                "sus lados miden " + height + "cm";
    }
}
