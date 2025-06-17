package day06_CLI;

public class FloatFromCIL {

    public static void main(String[] args) {

        //System.out.println(args[0]);

        String value=args[0];
        float f=Float.parseFloat(value);
        int a=(int)f;
        System.out.println(a);
    }
}
