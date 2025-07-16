package OOPS_AbstractClass;

public class AbstractClassConstructor {

    public static void main(String[] args) {

        Child c=new Child();
        c.loan();
        c.display();
    }
}

abstract class Parent
{
    Parent()
    {
        System.out.println("Abstract class constructor called");
    }
    abstract void loan();

    void display()
    {
        System.out.println("Method from abstract class");
    }
}

class Child extends Parent
{
    void loan()
    {
        System.out.println("Child class loan");
    }
}
