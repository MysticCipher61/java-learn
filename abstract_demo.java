abstract class  vechile 
{
    public abstract void  numVeels();    
}

class car extends vechile 
{
    public void numVeels()
    {
        System.out.println("Car has four weels");
    }
}

class Truck extends vechile 
{
    public void numVeels()
    {
        System.out.println("Trucks has Six/Eight weels");
    }
}


public class abstract_demo 
{
    public static void main(String[] args) 
    {
        car c = new car();
        c.numVeels();
        
        Truck t =new Truck();
        t.numVeels();
    }
}
