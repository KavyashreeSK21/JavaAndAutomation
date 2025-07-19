package OOPS_WrapperClass;

public class ConvertingStringToPrimitive {

    public static void main(String[] args) {

        String s = "123";
        Integer in=Integer.parseInt(s);
        int i=in;

        String s1 = "10";
        Integer a= Integer.valueOf(s1);

        System.out.println(i);
        System.out.println(a);
    }
}
