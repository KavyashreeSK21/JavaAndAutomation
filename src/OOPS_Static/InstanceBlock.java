package OOPS_Static;

public class InstanceBlock {

    public static void main(String[] args) {

        B b=new B();

        B b1 = new B();

        //Instance block will be exceuted at the time of object creation and this will call how many time we created object that many times this call
        //but staic block will call only once while class loads
        //Why we use static block??
        //If want to connect with DB, read excel file,read csv file we can write this kind of code in a static block

    }
}

class B
{
    static {
        System.out.println("This block will execute 1st");
    }
    {
        System.out.println("Its a instance block- It will be called at the time of object creation");
    }

    {
        System.out.println("2nd Instance block");
    }

    void m1()
    {
        System.out.println("Normal method");
    }
}
