package day06_CLI;

public class InputFromCLI {

    public static void main(String[] args) {

        //int age=25;
        String input = args[0];// We are passing input from command line it will accept String value and also the same value will be passed in String[] args
        //convert string into int
        int age=Integer.parseInt(input);

        String ICanvote = (age>=18) ? "Yes" : "No";
        System.out.println(ICanvote);
    }
}
