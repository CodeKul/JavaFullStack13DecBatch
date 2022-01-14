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

class Square extends Shape{
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    System.out.println("Enter base & height:");
                    int base = sc.nextInt();
                    int height = sc.nextInt();
                    shape = new Rectangle(base,height);
                    System.out.println("Area of Rectangle "+shape.calculateArea());
                    break;
                case 2:
                    System.out.println("Enter side");
                    int side = sc.nextInt();
                    shape = new Square(side);
                    System.out.println("Area of Square "+shape.calculateArea());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!!");
                    break;
            }
        }while (ch>4);

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