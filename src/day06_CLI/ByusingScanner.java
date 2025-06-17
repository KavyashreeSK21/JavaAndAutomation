package day06_CLI;

import java.util.Scanner;

public class ByusingScanner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=scanner.nextInt();//Interger value we are going to store from console
        System.out.println(age);
    }
}
