abstract class Figure
{
  Figure()
  {
    System.out.println("It's constructor of Figure");
  }
  abstract void print();
}

class open extends Figure
{
  public void print()
  {
    System.out.println("It's a open figure\n");
  }
}

class close extends Figure
{
  public void print()
  {
    System.out.println("It's a close figure\n");
  }
}

class polygon extends close
{
  public void print()
  {
    System.out.println("It's a polygon\n");
  }
}

class eclipse extends close
{
  public void print()
  {
    System.out.println("It's a eclipse\n");
  }
}

class line extends open
{
  public void print()
  {
    System.out.println("It's a line\n");
  }
}

class polyline extends open
{
  public void print()
  {
    System.out.println("It's a polyline\n");
  }
}

public class MainFigure
{
  public static void main(String args[])
  {
    Figure o = new open();
    o.print();
    Figure c = new close();
    c.print();
    Figure pg = new polygon();
    pg.print();
    Figure ec = new eclipse();
    ec.print();
    Figure ln = new line();
    ln.print();
    Figure pl = new polyline();
    pl.print();
  }
}
