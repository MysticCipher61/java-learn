//calculate the area of square and rectangle
//by using the OVERLOAIDNG method

import java.util.Scanner;

class overloadinginhava{
    static int area(int a)
    {
        System.out.println("Area of Squre:");
        int result;
        return result = a*a;
    }

    static int area(int w, int l)
    {
        System.out.println("Area of Rectangle:");
        int result;
        return result = w * l;
    }
}

public class overloading
 {    
    public static void main(String[] args) 
    {
        int result = overloadinginhava.area(45);
        int result1 = overloadinginhava.area(5,3);

        System.out.println("Area of Squere :" + result);
        System.out.println("Area of Rectangle:"+ result1);
    }
}