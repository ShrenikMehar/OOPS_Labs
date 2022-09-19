class Person
{
  String name;
  int age, salary;
  static int m;
  void getData(String name, int salary, int age)
  {
    this.name=name;
    this.salary=salary;
    this.age=age;
  }
  void printData()
  {
    System.out.println("Person name is "+name);
    System.out.println("His/Her Salary is "+salary);
    System.out.println("His/Her age is "+age+"\n");
  }
}

public class PersonData
{
  public static void main(String args[])
  {
    Person p1=new Person();
    p1.name="Shrenik";
    p1.salary=96969696;
    p1.age=18;
    p1.printData();
  }
}
