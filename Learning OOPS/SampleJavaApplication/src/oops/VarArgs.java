package oops;

public class VarArgs {
    public int add(String Message, int...n){
        int sum = 0;
        for (int i:n){// ForEach loop
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgs va = new VarArgs();
        System.out.println(va.add("Adding Numbers", 1,2,3,4,5,6,8,74,5,16,2));
    }
}
