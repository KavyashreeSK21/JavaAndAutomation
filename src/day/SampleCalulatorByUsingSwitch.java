package day;

import java.util.Scanner;

public class SampleCalulatorByUsingSwitch {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=scanner.nextInt();
        System.out.println("Enter b value");
        int b=scanner.nextInt();
        System.out.println("Enter the operator you want to do");
        String operator=scanner.next();

        int result;

        switch (operator)
        {
            case "+" :
                result=a+b;
                System.out.println(result);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            case "%" :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operators");
        }
    }
}
