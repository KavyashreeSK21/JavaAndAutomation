package OOPS_Interface;

public class MultipleInheritance {

    public static void main(String[] args) {

        Documents d=new Documents();
        d.print();
        d.show();

    }
}

interface Printable
{
   void print();
}

interface Showable
{
   void show();
}


class Documents implements Printable, Showable
{
    public void print()
    {
        System.out.println("Printable");
    }

    public void show()
    {
        System.out.println("Showable");
    }
}