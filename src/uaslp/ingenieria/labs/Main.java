package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.Circle;
import uaslp.ingenieria.labs.shapes.Rectangle;
import uaslp.ingenieria.labs.shapes.Square;
import uaslp.ingenieria.labs.shapes.Triangle;
import uaslp.ingenieria.labs.shapes.triangle.EquilateralTriangle;
import uaslp.ingenieria.labs.shapes.triangle.IsoscelesTriangle;
import uaslp.ingenieria.labs.shapes.triangle.ScaleneTriangle;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList<Shape> shapes = new LinkedList<>();

        //shapes.add(new Shape());

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5,2));
        shapes.add(new Rectangle(2,5));
        shapes.add(new Square(5));
        //shapes.add(new Triangle());
        shapes.add(new IsoscelesTriangle(10,15));
        shapes.add(new ScaleneTriangle(5,5,5));
        shapes.add(new EquilateralTriangle(10,10));

        for(Shape shape : shapes){
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSides());
            System.out.println(shape.getData());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("-----------------------------");
        }
    }
}
