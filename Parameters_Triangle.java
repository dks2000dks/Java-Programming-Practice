class Triangle
{
  private int a,b,c;
  Triangle (int x, int y, int z)                               //Constructor
  {
    a = x;
    b = y;
    c = z;
  }

  public double getArea()                                     //Area Function
  {
    double s = (a + b + c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
  }

  public double getPerimeter()                                //Perimeter Function
  {
    return (a+b+c);
  }

}

class Parameters_Triangle
{
  public static void main(String[] args)
  {
    Triangle t = new Triangle(3,4,5);                        //Calling Constructor
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());
  }
}