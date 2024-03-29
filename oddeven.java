//check whether given NO is odd or even
//print even no till 10;

import java.util.*;

class check 
    {
        static void check1(int a)
        {
            if (a % 2 == 0)
            {
                System.out.println("No is Even :"+a);
            }
            else
            {
                System.out.println("No is ODD :"+a);
            }
        }
    }
public class oddeven 
{
    public static void main(String[] args) 
    {
        int result;
        
        //check no is odd or even 
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter NO:");
            result=sc.nextInt();
            check.check1(result);


             // print even till 10
        for (int i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }    
        }      
    }    
}
