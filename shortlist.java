// program to shotlist student on basic oF Mark.
// First create student class which contains percentage oF student  in array     
// then exten it with class short  in which i will short the student in A,B,C


// Here i got the problem of index 
// array A B C got the values but not  in proper manner 
import java.util.*;

class student
{
	int[] percentage1 = new int[10];
	public  void student1()
	{
    		 Scanner sc = new Scanner(System.in);
				
				for(int i=0; i < 10; i++)
				{
				System.out.println("Enter Persentage For Student : "+ i );
				 percentage1[i]=sc.nextInt();        
  	}
			}
	}

class short2 extends student
{
	public  void short1()
	{	
		
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		for(int i=0;i<10;i++)
		{
			
			if(percentage1[i] >= 80)
			{
			//	percentage1[i] = A[temp1];
				A[temp1] = percentage1[i] ; 
				temp1++;
			}
			else if(percentage1[i] >= 60)
			{
			//	percentage1[i] = B[temp2];
				B[temp2] = percentage1[i] ;
				temp2++;
			}  
			else 
			{
			//  percentage1[i] = C[temp3];
				C[temp3] = percentage1[i] ;
				temp3++;
			}
			
		}
		System.out.println("Student with A Grede:");
		for(int i=0;i<10;i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("Student with B Grede:");
		for(int i=0;i<10;i++)
		{
			System.out.println(B[i]);
		}

		System.out.println("Student with C Grede:");
		for(int i=0;i<10;i++)
		{
			System.out.println(C[i]);
		}
	}
}

public class shortlist  
{
    public static void main(String[] args) 
    {
		short2 obj = new short2();
		obj.student1();
		obj.short1();
    }    
}
