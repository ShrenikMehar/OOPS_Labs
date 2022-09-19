import java.util.Scanner;

class Employee
{
  String name, ID;
  Employee(String name, String ID)
  {
    this.name=name;
    this.ID=ID;
  }
  void Display()
  {
    System.out.println("Details Entered:");
    System.out.println("Name: "+name+"\nID: "+ID);
  }
}

class IDException extends Exception
{
  public IDException(String str)
  {
    System.out.println("You have entered "+str);
  }
}

public class MainRoll
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner (System.in);
    System.out.println("Enter Name");
    String name = s.next();
    System.out.println("Enter ID");
    String ID = s.next();
    Employee E = new Employee(name,ID);
    char ch[] = ID.toCharArray();
    int n = ch.length;
    try
    {
      if((ch[0]=='C' && ch[1]=='S')||(ch[0]=='I' && ch[1]=='T')||(ch[0]=='E' && ch[1]=='C'))
      {
        if((ch[4]>=48 && ch[4]<=57)&&(ch[4]!=48 || ch[3]!=48))
        {
          if((ch[3]>=48 && ch[3]<=52)||(ch[3]==53 && ch[4]==48))
          {
            if(ch[2]==48)
            {
              System.out.println("Valid ID\n");
            }
            else
              throw new IDException("Invalid ID");
          }
          else
            throw new IDException("Invalid ID");
        }
        else
          throw new IDException("Invalid ID");
      }
      else
        throw new IDException("Invalid ID");
    }
    catch(IDException e)
    {
      System.out.println("\nError 404/42069 (ShrenigXD) : \nInvalid ID entered - "+e+"\n");
      System.out.println("ID's should start with CS, IT or EC \n& End with 000 to 050\n");
    }
    E.Display();
  }
}
