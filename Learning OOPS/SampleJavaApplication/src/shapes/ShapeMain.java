package shapes;

public class ShapeMain {
    public static void main(String[] args) {
        System.out.println("\n");

        // Shape s = new Shape();
        // System.out.println(s.area());

        // Circle c = new Circle(1);
        // System.out.println(c.area());

        // Rectangle r = new Rectangle(3,4);
        // System.out.println(r.area());

        // System.out.println("\n");

        // Implicit Casting + Method Override ==> Virtual Polymorphism
        Shape s = new Circle();
        System.out.println(s.area());

        System.out.println("\n");
    }
    
}
