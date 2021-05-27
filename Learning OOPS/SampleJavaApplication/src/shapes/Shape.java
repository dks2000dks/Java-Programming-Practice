package shapes;

public class Shape {
    private double d1, d2;

    public Shape() {
        System.out.println("Zero Argument Constructor of Shape");
        d1 = -1;
        d2 = -1;
    }

    public Shape(double d1) {
        System.out.println("One Argument Constructor of Shape");
        this.d1 = d1;
    }

    public Shape(double d1, double d2) {
        System.out.println("Two Argument Constructor of Shape");
        this.d1 = d1;
        this.d2 = d2;
    }

    public double perimeter(){
        System.out.println("Perimeter of the Shape = ");
        return 0.0;
    }

    public double area(){
        System.out.print("Area of the Shape = ");
        return 0.0;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }
    
}
