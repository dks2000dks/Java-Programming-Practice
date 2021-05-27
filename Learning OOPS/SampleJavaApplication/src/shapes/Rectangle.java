package shapes;

public class Rectangle extends Shape{
    public Rectangle(){
        System.out.println("Zero Argument Constructor of Rectangle");
    }

    public Rectangle(double d1, double d2) {
        super(d1, d2);
        System.out.println("Two Argument Constructor of Rectangle");
    }

    @Override
    public double perimeter() {
        System.out.print("Perimeter of the Rectangle = ");
        return 2*(getD1() + getD2());
    }

    @Override
    public double area() {
        System.out.print("Area of the Rectangle = ");
        return getD1() * getD2();
    }
}
