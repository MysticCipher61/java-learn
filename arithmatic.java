import java.util.*;

public class arithmatic 
{
    public static void main(String[] args) 
    {
        int no1, no2, result;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter No 1: ");
        no1 = sc.nextInt();

        System.out.println("Enter No 2 :");
        no2 = sc.nextInt();

        //Addtion
        result= no1 + no2;
        System.out.println("Addtion :"+result);

        //subtarction
        result = no1 - no2;
        System.out.println("Subtraction : " + result);

        //multiply
        result = no1 * no2;
        System.out.println("Multiply : " + result);

        //division 
        result = no1 / no2 ;
        System.out.println("Division :"+result);
    }
    
}
