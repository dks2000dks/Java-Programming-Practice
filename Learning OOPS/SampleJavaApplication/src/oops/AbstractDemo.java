package oops;

abstract class One{
    void m1(){
        System.out.println("m1 method of One");
    }

    abstract void m2();
}

class Two extends One{
    @Override
    void m2() {
        System.out.println("m1 method of Two");
    }
    
}

public class AbstractDemo {
    // Objects cannot be created form Abstract class
    // One o = new One()
    public static void main(String[] args) {
        Two t = new Two();
    }
    
}
