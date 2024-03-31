class t1 extends Thread
{
    public void run()
    {  
        
        for (int i = 0; i < 15; i++) 
        {
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread" + i);    
        }
    }
    
}

class t2 extends Thread
{
    public void run()
    {  
        
        for (int i = 0; i < 15; i++) 
        {
            try 
            {
                Thread.sleep(2000);
            } catch (InterruptedException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Thread of class T2" + i);    
        }
    }
    
}


public class thread_demo 
{
    public static void main(String[] args) 
    {   
        t1 obj = new t1();
        t2 obj2 = new t2();
        obj.start();
        obj2.start();    
            
    }    
}