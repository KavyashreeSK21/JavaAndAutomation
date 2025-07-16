package OOPS_Interface;

public class ConstantsBehave {

    public static void main(String[] args) {

        Bus b=new Bus();
        b.gear();
        System.out.println("Max Speed is: " +VehicleDemo.speedLimit);

    }
}

interface VehicleDemo
{
    int speedLimit=120;
    void gear();
}

class Bus implements VehicleDemo
{

    public void gear()
    {
        //speedLimit=210;bcoz it is final in nature, we can't change variables by default All variables are public static and final in nature
        System.out.println("We have 5 gears in bus");
    }
}