package abstraction;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape{
    int base;
    int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5*base*height);
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base & height:");
        int base = sc.nextInt();
        int height = sc.nextInt();
        Shape shape = new Rectangle(base,height);
        System.out.println("Area of Rectangle "+shape.calculateArea());
    }
}

/**
 * 1.Rect
 * 2.Square
 * 3.Triangle
 * 4.Circle
 * Enter your choice 1
 * Enter base & height
 * Area of Rect ....
 * Do you want to continue? Y / N
 * 1.Rect
 *  * 2.Square
 *  * 3.Triangle
 *  * 4.Circle
 *  * Enter your choice
 */