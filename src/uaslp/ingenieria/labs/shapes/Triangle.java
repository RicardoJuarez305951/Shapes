package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Triangle extends Shape {
    public float base;
    public float height;

    public String getName(){
        return "Triangle";
    }

    public int getSides() {
        return 3;
    }
}
