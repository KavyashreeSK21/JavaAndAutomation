package day06_CLI;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ByUsingScanner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name =scanner.next();//For string

        System.out.println("My name is :" +name);

        //Float
        System.out.println("Enter float value");
        float f= scanner.nextFloat();
        System.out.println(f);

        //double
        System.out.println("Enter double value");
        double d=scanner.nextDouble();
        System.out.println(d);

    }
}
