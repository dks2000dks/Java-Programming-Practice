import java.util.*;
class Operations{
  int real;
  int imag;
  public Operations(int r, int i){
    real = r;
    imag = i;
  }

  public static Operations add(Operations a, Operations b){
    return new Operations((a.real+b.real),(a.imag+b.imag));
  }

  public static Operations diff(Operations a, Operations b){
    return new Operations((a.real-b.real),(a.imag-b.imag));
  }

  public static Operations product(Operations a, Operations b){
    return new Operations(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
  }

  public void printOperations(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }

}

class Complex{
  public static void main(String[] args){
    Operations c = new Operations(4,5);
    Operations d = new Operations(9,4);

    Operations e = Operations.add(c,d);
    Operations f = Operations.diff(c,d);
    Operations g = Operations.product(c,d);
    e.printOperations();
    f.printOperations();
    g.printOperations();
  }
}