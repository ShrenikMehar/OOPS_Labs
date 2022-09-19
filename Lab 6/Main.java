import java.util.Scanner;

class Employee
{
  int id, salary;
  String name;
  Employee(String name, int id, int salary)
  {
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
}

interface taxable
{
  void calculateTax();
}

class permanent extends Employee implements taxable
{
  int tax;
  permanent(String name, int id, int salary)
  {
    super(name, id, salary);
  }
  public void calculateTax()
  {
    if(salary>=100000 && salary<=500000)
    {
      tax=(int) (salary*0.1);
    }
    else if(salary>500000)
    {
      tax=(int) (salary*0.2);
    }
    else
    {
      System.out.println("Invalid");
    }
  }
  void AdditionalEarning()
  {
    System.out.println("There is no Additional Earning");
  }
  void Display()
  {
    System.out.println("Salary is "+salary+"\nTax is "+tax);
  }
}

class HourlyEmployee extends Employee
{
  int HoursWorked, RatePerHour;
  HourlyEmployee(String name, int id, int salary, int HoursWorked, int RatePerHour)
  {
    super(name, id, salary);
    this.HoursWorked=HoursWorked;
    this.RatePerHour=RatePerHour;
  }
  public int Salary(int HoursWorked, int RatePerHour)
  {
    return HoursWorked*RatePerHour;
  }
}

public class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = s.nextLine();
    System.out.println("Enter your id");
    int id = s.nextInt();
    System.out.println("How much you worked:");
    int HoursWorked = s.nextInt();
    System.out.println("What is rateperhour:");
    int RatePerHour = s.nextInt();
    int StoreSalary = 0;
    HourlyEmployee he = new HourlyEmployee(name,id,StoreSalary,HoursWorked,RatePerHour);
    StoreSalary = he.Salary(HoursWorked,RatePerHour);
    permanent p = new permanent(name,id,StoreSalary);
    p.calculateTax();
    p.AdditionalEarning();
    p.Display();
  }
}
