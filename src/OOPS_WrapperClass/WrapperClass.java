package OOPS_WrapperClass;

public class WrapperClass {

    //Use of wrapperclass??Why u go for wrapper class??
    //all data types are primitive but java accept objects
    //all wrapper class have properties and behaviours

    //we can convert primitive data type to wrapper class
    //all primitive data type have its corresponding wrapper class



    public static void main(String[] args) {

        //convert primitive to wrapper class is called as autoboxing
        int a=10;
        Integer i=a;
        i.compareTo(20);
        //reference i now have so many methods

        //convert wrapper to primitive is called unboxing
        Integer j=20;
        int b=j;

        //now reference b dont have any methods


        //convert String to int (primitive data type)
        //there are 2 ways we can convert string into integer

        String s="10";
        Integer val=Integer.parseInt(s);
        Integer val1=Integer.valueOf(s);

        //convert int into string

        int value=10;
        Integer in=value;
        String s1=in.toString();
        System.out.println(s1);

    }


}
