package shapes;

import java.lang.Math;

public class Circle extends Shape{
    // Private Variables and Constructors cannot be Inherited.
    // Super Commands is used for invoking Constructors.

    public Circle(){
        System.out.println("Zero Argument Constructor of Circle");
    }

    public Circle(double d1) {
        super(d1);
        System.out.println("One Argument Constructor of Circle");
    }

    @Override
    public double perimeter() {
        System.out.print("Perimeter of the Circle = ");
        return 2 * Math.PI * getD1();
    }
    
    @Override
    public double area() {
        System.out.print("Area of the Circle = ");
        return Math.PI * getD1() * getD1();
    }
}
