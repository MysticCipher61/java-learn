//scan 3 interger values from user
//& Find the Minimum Value by conditional operater/

import java.util.*;

public class scan 
{
    public static void main(String[] args)
     {    
        int a,b,c;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Value No 1:");
       a=sc.nextInt();

       System.out.println("Enter Value No 2:");
       b=sc.nextInt();

       System.out.println("Enter Value No 3:");
       c=sc.nextInt();

        if (a<b && a<c)
        {
                System.out.println("No 1 is Minimest.");
        }
         else  
        {
              if (b<c)
             {
              System.out.println("No 2 is Miniest.");  
             }  
             else
             {
                System.out.println("No 3 is miniest.");
             }
        }

            
    }
}
