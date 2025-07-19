package OOPS_Static;

public class StaticAccess {

    public static void main(String[] args) {

    }
}

class C
{
    static int age=3;
    String name = "AK";
    static void m2()
    {
        //System.out.println(name);
        //inside the static method we cant access non static members
        //Why we cantr access??
        //Nan static members will be accessed by using the object reference.Static members will be loaded at class loader
    }

    void m3()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }
}