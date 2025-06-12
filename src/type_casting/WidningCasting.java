package type_casting;

public class WidningCasting {

    public static void main(String[] args) {

        //widning-- converting small data type to large data type
        //implicit and explicit
        //implicit-- Automatically it will happen
        //Explicit-- Extranally we should add

        //byte-- short-- int-- long--float-- double

        short sh=10;
        int i=sh;
        System.out.println(i);//here we are storing small data type into large

        long l= 2882999920902l;
        double d=l;
        System.out.println(d);

        // both are same above we did implicit casting
        //here we did explicit casting
        long l1= 2882999920902l;
        double d1=(double) l1;
        System.out.println(d);

        //incase of widning its not mandatory to specify the data type


    }
}
