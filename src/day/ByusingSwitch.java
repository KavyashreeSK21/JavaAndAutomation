package day;

import java.util.Scanner;

public class ByusingSwitch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=scanner.next().toLowerCase().charAt(0);

        switch (ch)
        {
            case 'a' :
                System.out.println("vowel");
                break;
            case 'e' :
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonent");
        }
    }
}