package OOPS_Interface;

public class InterfacesSupportPolymorphism {

    public static void main(String[] args) {

        Playable p=new Guitar();
        p.play();

        Playable p1=new Piano();
        p1.play();
    }
}

interface Playable
{
    void play();
}

class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable
{
    public void play()
    {
        System.out.println("Piano is playing");
    }
}