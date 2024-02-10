//calculator using Switch statment.

import java.util.*;

class calculator 
{
    static void Addition(int a ,int b)
    {
        int result = 0;
        result = a + b ;
        System.out.println("Addtion is : "+result);
    }

    static void Subtration(int a ,int b)
    {
        int result = 0;
        result = a - b ;
        System.out.println("Subtraction is : "+result);
    }

    static void Multiply(int a ,int b)
    {
        int result = 0;
        result = a * b ;
        System.out.println("Multiply is : "+result);    
    }

    static void Division(int a ,int b)
    {
        int result = 0;
        result = a / b ;
        System.out.println("Division is : "+result);
    }
}

public class calcbyswitch 
{
    public static void main(String[] args) 
    {
        int i,x,y;
        Scanner sc =new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtration");
        System.out.println("3. Multiply");
        System.out.println("4. Division");

        System.out.println("Enter Choice:");
        i= sc.nextInt();

            switch (i) {
                case 1 :
                {
                    System.out.print("Enter NO 1:");
                    x=sc.nextInt();
                    System.out.print("Enter NO 2:");
                    y=sc.nextInt();
                    
                    calculator.Addition(x,y);
                    break;
                }
                case 2 :
                {
                    System.out.print("Enter NO 1:");
                    x=sc.nextInt();
                    System.out.print("Enter NO 2:");
                    y=sc.nextInt();
                    
                    calculator.Subtration(x,y);
                    break;
                    
                }
                case 3 :
                {
                    
                    System.out.print("Enter NO 1:");
                    x=sc.nextInt();
                    System.out.print("Enter NO 2:");
                    y=sc.nextInt();
                    
                    calculator.Multiply(x,y);
                    break;
                }
                case 4 :
                {
                    System.out.print("Enter NO 1:");
                    x=sc.nextInt();
                    System.out.print("Enter NO 2:");
                    y=sc.nextInt();
                    
                    calculator.Division(x,y);
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
