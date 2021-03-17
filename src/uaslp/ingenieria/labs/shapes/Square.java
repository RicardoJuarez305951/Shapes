package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private float side;

    public Square(float side){
        this.side = side;
    }
    public String getName(){
        return "Square";
    }

    public float getPerimeter() {
        return side*4;
    }

    public float getArea() {
        return side*side;
    }

    public int getSides() {
        return 4;
    }

    public String getData() {
        return "Sus lados miden " + side + "cm";
    }
}
