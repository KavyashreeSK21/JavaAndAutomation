package day;

import java.util.Scanner;

public class CheckVowelAssignment {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch=scanner.next().toLowerCase().charAt(0);
        if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') )
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("consonants");
        }




    }
}
