package day;

import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0) )
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
