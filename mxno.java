import java.util.*;
        //Program No-3
        //Find Max NO from Two No
        //Without Using Third Variable
public class mxno 
{
    public static void main(String[] args) {
        int no1, no2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter No 1: ");
        no1 = sc.nextInt();

        System.out.println("Enter No 2 :");
        no2 = sc.nextInt();

        if(no1>no2)
        {
            System.out.println("NO 1 is Grater" + no1);
        }
        else
        {
            System.out.println("No2 is Greater" + no2);
        }
        
    }    
}
