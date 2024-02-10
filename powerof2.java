// power of 2 
// i.e 2,4,8,16
//Upto 1024 

public class powerof2 
{
    
   
    public static void main(String[] args) 
    {
            int result = 1 ;        
        do 
        {
            
            result =  result * 2;
            System.out.println( result);
        } while (result < 1024);
    }
}
