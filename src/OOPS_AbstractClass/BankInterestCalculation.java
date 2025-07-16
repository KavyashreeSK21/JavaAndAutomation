package OOPS_AbstractClass;

public class BankInterestCalculation {

    public static void main(String[] args) {

        SBI s=new SBI();
        s.getInterestRate();


        HDFC h=new HDFC();
        h.getInterestRate();
    }

}

abstract class Bank
{
    abstract void getInterestRate();
}

class SBI extends Bank
{
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank
{
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}