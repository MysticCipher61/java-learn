//create an array to store 5 integer value
//and initialize an array
//and print it in reverse order

import java.util.*;

public class array  
{
    public static void main(String[] args) 
    {
        int no[] = new int[5];  //Array Declartion  
        int i;
        Scanner  sc = new Scanner(System.in);

        for (i = 0; i < 5; i++)  //Initilisging 
        {
            System.out.print("Enter"+ i + "=" );    
            no[i]= sc.nextInt();  //scaning the array
        }
        
        //print in order
        System.out.println("Print In Order");
        for (i = 0; i < no.length; i++) 
        {
            System.out.println(no[i]);    
        }

        //print in reverse order
        System.out.println("Print in Reverse Order");
        for( i = no.length ; i>0 ; i--)
        {
                System.out.println(no[i-1]);
        }

    }    
}
