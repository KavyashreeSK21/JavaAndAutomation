package type_casting;

public class NarrowingCasting {

    public static void main(String[] args) {

        //Narrowing--converting large data type into small
        //Here we may loose the data

        // double-- float-- long-- int-- short-- byte

        double d=388388.3898739;
       // int i=d;//its not possible we have to specify the data type here
        int i=(int)d;
        System.out.println(i);

        long l=3888399922883l;
        float f=l;//it is implicit casting
        System.out.println(f);

        long l1=3888399922883l;
        short sh=(short)l1;//it is explicit casting
        System.out.println(sh);



    }
}
