class Member
{
  String name, address, phonenumber;
  int age;
  long salary;
  void printSalary()
  {
    System.out.println("Salary is "+salary);
  }
}

class Employee extends Member
{
  String specialization;
}

class Manager extends Member
{
  String department;
}

public class company
{
  public static void main(String args[])
  {
    Employee e = new Employee();
    e.name="Shrenik";
    e.age=19;
    e.phonenumber="9158069420";
    e.address="Los Santos";
    e.salary=96919233;
    System.out.println("For Employee: ");
    e.printSalary();
    Manager m = new Manager();
    m.name="ManagerSahab";
    m.age=21;
    m.phonenumber="9212173314";
    m.address="Andheri";
    m.salary=699192;
    System.out.println("For Manager: ");
    m.printSalary();
  }
}
