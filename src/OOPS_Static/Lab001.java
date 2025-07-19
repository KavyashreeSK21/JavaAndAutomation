package OOPS_Static;

import java.util.SortedMap;

public class Lab001 {

    //static is a keyword
    //we can use static in variables,methods and blocks
    //Static code will be executed the moment class loads
    //Object creation is not required to access static variables & methods
    //we can access directly by using class name
    //all the common things we are keeping in static variables and methods
    //ex- student collage name is same for all the student so we are keeping as static variable
    //ex-- all the wait methods and reusable methods we must specify as static methods we can access directly without object creation
    //this can be share across all

    public static void main(String[] args) {

        A a=new A();
        A.attendClass();//we are accessing a static method by using the class name
        System.out.println(A.courseName);//we are accessing static variable by using class name


        //We can also access static variables by using an object reference.
        System.out.println(a.courseName);
    }
}

class A
{
    static String courseName="JavaAutomation";

    static void attendClass()
    {
        System.out.println("Its a static method");
    }

    void display()
    {
        System.out.println("Its a non static method");
    }
}
