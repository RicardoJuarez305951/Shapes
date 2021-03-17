package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {
    private float base;
    private float height;

    public Rectangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    public String getName(){
        return "Rectangle";
    }

    public float getPerimeter() {
        return base * 2 + height * 2;
    }

    public float getArea() {
        return base*height;
    }

    public int getSides() {
        return 4;
    }
    public String getData() {
        return "Cuenta con una base de " + base + "cm y " +
                "una altura de " + height + "cm";
    }
}
