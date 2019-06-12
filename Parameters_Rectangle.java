import java.util.*;
class Rectangle
{
  int length,breadth;

  public Rectangle(int l, int b)
  {
    length = l;
    breadth = b;
  }

  public int getArea()
  {
    return (length * breadth);
  }

  public int getPerimeter()
  {
    return (2 * (length + breadth));
  }

}

class Parameters_Rectangle
{

  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s.nextInt();
    System.out.println("Enter breadth");
    b = s.nextInt();

    Rectangle a = new Rectangle(l,b);
    System.out.println("Area : "+a.getArea());
    System.out.println("Perimeter : "+a.getPerimeter());
  }

}