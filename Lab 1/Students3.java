class Student
{
  String name, department;
  int hallticket;
  void getData(String name, String department, int hallticket)
  {
    this.name=name;
    this.department=department;
    this.hallticket=hallticket;
  }
  void printData()
  {
    System.out.println("Student name is "+name);
    System.out.println("Student is from "+department);
    System.out.println("Student hall ticket "+hallticket+"\n");
  }
}

public class Students3
{
  public static void main(String args[])
  {
    Student s1=new Student();
    Student s2=new Student();
    s1.name="Shrenik";
    s1.department="CSE (Cyber Security)";
    s1.hallticket=86069;
    s2.getData("Manoj Tiwari","Music",69420);
    s1.printData();
    s2.printData();
  }
}
