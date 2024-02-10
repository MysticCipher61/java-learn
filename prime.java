//Create an array Containing 10 values
//Then Print Prime Values

import java.util.*;

public class prime 
{
    public static void main(String[] args) 
    {
        int no[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < no.length; i++) 
        {
            System.out.print("Enter "+ i +":");
            no[i] = sc.nextInt();
        }

        System.out.println("Prime No Are's : ");
        for (int i = 0; i < no.length; i++) 
        {
            if(no[i]%2==1)
            {
                System.out.println(no[i]);
            }    
        }
    }
}
