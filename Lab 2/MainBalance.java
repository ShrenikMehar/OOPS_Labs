class Bank
{
  int getBalance()
  {
    return 0;
  }
}

class BankA extends Bank
{
  int getBalance(int bal)
  {
    return bal;
  }
}

class BankB extends Bank
{
  int getBalance(int bal)
  {
    return bal;
  }
}

class BankC extends Bank
{
  int getBalance(int bal)
  {
    return bal;
  }
}

public class MainBalance
{
  public static void main(String args[])
  {
    BankA a = new BankA();
    BankB b = new BankB();
    BankC c = new BankC();
    System.out.println("Balance in Bank A is $"+a.getBalance(1000));
    System.out.println("Balance in Bank B is $"+b.getBalance(1500));
    System.out.println("Balance in Bank C is $"+c.getBalance(2000));
  }
}
