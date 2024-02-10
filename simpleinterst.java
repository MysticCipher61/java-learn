import java.util.*;
                //program for simple interst
                //univercity program-2
public class simpleinterst 
{
    public static void main(String[] args) 
    {
            int p,r,n;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Principal Amount:");
            p = sc.nextInt();
            
            System.out.println("Enter the Rate of Interst:");
            r = sc.nextInt();

            System.out.println("Enter NO of Years:");
            n = sc.nextInt();


            int result;

            result = (p*r*n)/100;
            System.out.println("Ammount of Interst is "+ result);

    }    
}
