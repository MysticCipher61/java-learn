//  Program given in colledge
//  Here i have to find Factorial of string Value.
//  here i had to use wrapper class

import java.util.*;

public class string_to_int 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String aa ;
        int i1=1;

        System.out.println("Enter No :");
        aa = sc.nextLine();

        Integer a1 = new Integer(aa);   //this is Wrapper Class .
                                        // I had Created obj of wrapper class so that i can convert string obj into int obj

        System.out.println(a1);
        
        
        for (int i = 1; i <= a1 ; i++) 
        {
            i1 = i * i1 ;
        }

        System.out.println(i1);
    }
}