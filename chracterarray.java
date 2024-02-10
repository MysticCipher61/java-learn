//Create Character Array to Store 6 character
//Also initialize with random character
//
//Also create another array with 10 chracter and 
//copy the element from index 2 to 4 from first array to second array at the same index.

import java.util.*;

public class chracterarray 
{
    public static void main(String[] args) 
    {
        char arr[] = new char[5];
        Scanner sc =new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) 
        {
                Random random = new Random(arr[i]);
        }

        //Printting Array

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);    
        }
    }    
}
