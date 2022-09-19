class Student
{
  String name, city;
  int age;
  static int m;
  void printData()
  {
    System.out.println("Student name is "+name);
    System.out.println("Student is from "+city);
    System.out.println("Student age is "+age+"\n");
  }
}

public class Students1
{
  public static void main(String args[])
  {
    Student s1=new Student();
    s1.name="Shrenik";
    s1.city="Nagpur";
    s1.age=18;
    s1.printData();
  }
}
