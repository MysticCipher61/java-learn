import java.util.*;;

/**
 * Numbers
 * 
 */
interface Numbers
{
    public int process (int x, int y);
}


// interface Numbers
// {
//     public int process (int x, int y);

// }

class sum implements Numbers
{
    public int process(int x, int y)
    {
        return (x+y);
    }
}

class Average implements Numbers
{
    public int process (int x, int y)
    {
        return ((x+y)/2);
    }
}


public class interface2_demo2
{
    public static void main(String[] args) 
    {
        int a,b;
        sum add = new sum();
        a= add.process(10, 20);
        System.out.println("Sum is :" + a);
        
        Average avg = new Average();
        b= avg.process(10,20);
        System.out.println("Avg is :"+b);
    }    
}
