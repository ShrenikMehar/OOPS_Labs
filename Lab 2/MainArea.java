class Area
{
  double a, s, l, b;
  void area(double s)
  {
    this.a=s*s;
    System.out.println("Area of Square is "+a+" units sqr");
  }
  void area(double l, double b)
  {
    this.a=l*b;
    System.out.println("Area of Rectangle is "+a+" units sqr");
  }
}

public class MainArea
{
  public static void main(String args[])
  {
    Area c1=new Area();
    Area c2=new Area();
    c1.area(7.8);
    c2.area(6.9,4.20);
  }
}
