package oops;

public class CalculatorOverload {
    public int add(int a, int b){
        System.out.println("Adding 2 Integers");
        return a+b;
    }

    public float add(float a, float b){
        System.out.println("Adding 2 Floats");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.println("Adding 3 Integers");
        return a+b+c;
    }

    public float add(int a, float b){
        // Automatic Type Promotions....
        // int + float = float --> Correct
        // int + float = int --> Error
        System.out.println("Adding Integer and Float");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("\n");
        CalculatorOverload co = new CalculatorOverload();
        System.out.println(co.add(23,23));
        System.out.println(co.add(23,23.5f));
        System.out.println(co.add(23.5f,23.5f)); // Mention it as float as double is default data-type
    }
}
