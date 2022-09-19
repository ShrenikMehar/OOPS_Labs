class Student2
{
  String name, city;
  int age;
  static int m;
  void getData(String name, String city, int age)
  {
    this.name=name;
    this.city=city;
    this.age=age;
  }
  void printData()
  {
    System.out.println("Student name is "+name);
    System.out.println("Student is from "+city);
    System.out.println("Student age is "+age+"\n");
  }
}

public class Students2
{
  public static void main(String args[])
  {
    Student2 s1=new Student2();
    s1.name="Shrenik";
    s1.city="Nagpur";
    s1.age=18;
    s1.printData();
  }
}
