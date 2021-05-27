package oops;

class A{

    public A() {
        System.out.println("Constructor of A");
    }

    public A(String Msg) {
        System.out.println("Constructor of A with One Argument and Argument is " + Msg);
    }
    
}

class B extends A{

    public B() {
        // Zero Argument Constructor is Implicitly called.
        // So, we use super() command to explicitly invoke
        // super("Buzzinga");
        System.out.println("Constructor of B");
    }
    
}

class C extends B{

    public C() {
        System.out.println("Constructor of C");
    }
    
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("\n");
        C c = new C();
    }
}
