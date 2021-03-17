package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;
import java.math.*;

public class Circle extends Shape {
    private float radio;

    public Circle(float radio){
        this.radio = radio;
    }

    public float getArea() {
        return (float) (3.14591*radio*radio);
    }


    public float getPerimeter() {
        return (float) (3.14591*radio*2);
    }

    public String getName(){
        return "Circle";
    }


    public int getSides() {
        return 1;
    }
    public String getData() {
        return "Cuenta con un radio de " + radio+ "cm";
    }
}
