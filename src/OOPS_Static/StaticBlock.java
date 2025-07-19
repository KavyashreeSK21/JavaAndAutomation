package OOPS_Static;

public class StaticBlock {

    //we can also have static block
    //Its is a piece of code which will execute 1st when the class loads
    //this will execute only once


    public static void main(String[] args) {

        Demo d = new Demo();//the movement we write Demo it will call static block
        d.display();

        Demo d1= new Demo();
        d1.display();// again static block code will not execute it will execute only once
    }
}

class Demo
{
    static {
        System.out.println("This code will be executed 1st when class loads-- Its a static block");
          }

          Demo() {
              System.out.println("Its a default constructor");
          }

          void display()
          {
              System.out.println("Normal code");
          }


}