class Degree
{
  void getDegree()
  {
    System.out.println("I got Degree");
  }
}

class Undergraduate extends Degree
{
  void getDegree()
  {
    System.out.println("I am Undergraduate");
  }
}

class Postgraduate extends Degree
{
  void getDegree()
  {
    System.out.println("I am Postgraduate");
  }
}

public class MainDegree
{
  public static void main(String[] args)
  {
    Degree d = new Degree();
    Undergraduate ug = new Undergraduate();
    Postgraduate pg = new Postgraduate();
    d.getDegree();
    ug.getDegree();
    pg.getDegree();
  }
}
