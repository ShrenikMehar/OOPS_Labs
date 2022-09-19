class Rectangle
{
  int l, b;
  Rectangle(int l, int b)
  {
    this.l=l;
    this.b=b;
  }
  int area()
  {
    return l*b;
  }
  int perimeter()
  {
    return 2*(l+b);
  }
}

class Square extends Rectangle
{
  Square(int s)
  {
    super(s,s);
  }
}

public class Quadrilateral
{
  public static void main(String args[])
  {
    Rectangle r = new Rectangle(6,9);
    Square s = new Square(8);
    System.out.println("Area of Rectangle is "+r.area());
    System.out.println("Perimeter of Rectangle is "+r.perimeter());
    System.out.println("Area of Square is "+s.area());
    System.out.println("Perimeter of Square is "+s.perimeter());
  }
}
