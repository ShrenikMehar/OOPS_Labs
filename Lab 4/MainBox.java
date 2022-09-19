class Box
{
  float height, width, depth;
  static int count=0;
  Box(float height, float width, float depth)
  {
    this.height = height;
    this.width = width;
    this.depth = depth;
    count++;
  }
  static float Area(float h, float w, float d)
  {
    float Area = (2*((h*w)+(w*d)+(h*d)));
    return Area;
  }
  static void DisplayCount()
  {
    System.out.println("\nNumber of Objects of class box created are "+count);
  }
  void Display()
  {
    System.out.println("Height of the box is : "+height);
    System.out.println("Width of the box is : "+width);
    System.out.println("Depth of the box is : "+depth+"\n");
  }
}

public class MainBox
{
  public static void main(String[] args)
  {
    Box a = new Box(6, 9, 4);
    a.Display();
    Box b = new Box(4, 2, 4);
    b.Display();
    Box c = new Box(9, 8, 9);
    c.Display();
    float A = a.Area(10, 9, 8);
    System.out.println("Area of the box 1 is : "+A);
    float B = b.Area(6, 5, 4);
    System.out.println("Area of the box 2 is : "+B);
    float C = c.Area(2, 3, 1);
    System.out.println("Area of the box 3 is : "+C);
    Box.DisplayCount();
  }
}
