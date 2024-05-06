//it's program given in colloege
//it's About find the largest & Smallest in the Array With Exection Handling
// But At this point i have to learn it , i dont know how it works,

//Here i did is short the array 
//by doing shorting i got the smallest in last &
//largest in First position.

import java.util.*;

public class largeest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // array declare

        //Scaning the array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("Enter No At : "+i);
            arr[i] = sc.nextInt();    
        }

        //Print Array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("At Position  "+ i +"=" +arr[i]);    
        }

        //Shorting 
    //  int largest = 0 ;
        int temp;

        try 
        {
            for (int i = 0; i < arr.length; i++) 
            {
                for (int j = 0; j < arr.length; j++) 
                {
                    if (arr[i]>arr[j])
                    {
                        temp    =   arr[i];
                        arr[i]  =   arr[j];
                        arr[j]  =   temp;
                    }    
                }
                      
            }    
        } 
        catch (Exception e) 
        {
            // TODO: handle exception
            System.out.println("ERROR: Printed By User");
        }
        

        System.out.println("After Shorting");
        System.out.println("----------------");

        // After Shorting Print Array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("At Position  "+ i +"=" +arr[i]);    
        }

        //Print the Smallest And largest 
        System.out.println("largest No of Array is : "+arr[0]);
        System.out.println("-----------------------------------");
        System.out.println("Smallest No of Array is : "+arr[4]);
        
    }
}
