 // Interface is used for multiple inharitence
/**
 * calcu
 * late_area
 */
// public interface calculate_area 
// {
//        final float pi=3.14f;  //final keyword used to give an finalise value to the object it can not be changed in any cindition.
   
//        public float  area(int x);   //this is called as "ABSTRACT METHOD" 
//        public void shape();        // IN interface we must have to use abstract method
//                                    //an abstract mathod does not contain body
//                                    //body to given to the abstract mathod bt inhartince.
    
    
// }


   interface  calculate_area
 {
    final float pi=3.14f;  //final keyword used to give an finalise value to the object it can not be changed in any cindition.

    public float  area(int x);   //this is called as "ABSTRACT METHOD" 
    public void shape();        // IN interface we must have to use abstract method
                                //an abstract mathod does not contain body
                                //body to given to the abstract mathod bt inhartince.
 }

class Squere implements calculate_area
{
    public float area(int x)
    {
        return x*x;
    }
    public void shape()
    {
        System.out.println("From Square");

    }
}

class Circle implements calculate_area
{
    public float area(int x)
    {
        return pi*x*x;
    }
    public void shape()
    {
        System.out.println("From Circle");      
    }
}

class interface_demo
{
    public static void main(String[] args) 
    {
        Squere s = new Squere();
        System.out.println("Area of Square : "+ s.area(2));
        s.shape();

        Circle c = new Circle();
        System.out.println("Area of Circle : "+ c.area(2));
        c.shape();    
    }
}