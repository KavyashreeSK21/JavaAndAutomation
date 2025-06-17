package IfElseStatement;

import java.util.Scanner;

public class TriangleProgram {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a b and c values");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if((a==b) && (a==c))
        {
            System.out.println("equilateral ");
        } else if ((a==b) || (a==c) ||(b==c))
        {
            System.out.println("Exactly two sides are equal");
        }
        else {
            System.out.println("no sides are equal");
        }
    }
}
