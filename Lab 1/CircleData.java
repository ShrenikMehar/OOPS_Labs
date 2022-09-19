class Circle
{
  int x, y, r;
  void getData(int x, int y, int r)
  {
    this.x=x;
    this.y=y;
    this.r=r;
  }
  void printData()
  {
    System.out.println("Radius of Circle is "+r+" units");
    System.out.println("Diameter of Circle is "+2*r+" units");
    System.out.println("Area of Circle is "+3.14*r*r+" units");
    System.out.println("Circumference of Circle is "+2*3.14*r+" units");
    System.out.println("Centre of Circle is ("+x+", "+y+")\n");
  }
}

public class CircleData
{
  public static void main(String args[])
  {
    Circle c1=new Circle();
    Circle c2=new Circle();
    c1.x=6;
    c1.y=9;
    c1.r=4;
    c2.getData(4,2,6);
    c1.printData();
    c2.printData();
  }
}
