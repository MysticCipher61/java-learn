// write a program to Convert
//inches to centimeter 


//centimeter =inches*2..54
//inches = centimeter/2.54

import java.util.*;

public class inchtoCM
 {
    
    public static void main(String[] args) 
    {
        double inch;
        double centimeter;
        double result;
        int Choice;

        System.out.println("1 . Inch To CM");
        System.out.println("2 . CM To inch");

        Scanner sc= new Scanner(System.in);
        Choice = sc.nextInt();

        switch(Choice) {
            case 1:{
            System.out.println("Enter Inch :");
            inch= sc.nextDouble();
    
            result = inch * 2.54;
            System.out.println("Centimeter = "+result);
                
            break;
            }
            case 2:{
                System.out.println("Enter Centimeter :");
                centimeter= sc.nextDouble();
        
                result = centimeter / 2.54;
                System.out.println("Inches = "+result);       
                break;
            }
            default:
            {
                System.out.println("Enter Valid Choice");
                break;
            }
        }


    }
}
