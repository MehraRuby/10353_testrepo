package mypack;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    
    public int add(int a,int b)
    {    
    	return a+b; 
    }
    
    public int addition(int a,int b)
    {    
    	System.out.println("Adding values : "+(a+b));    
    	return a+b;
    }
    
    
    public static boolean isEquals(long a , long b)
    {
    	return (a == b) ? true : false ;
    }
    
    public static boolean isEven(long val)
    {
    	return (val % 2 == 0) ? true : false;
    }
    
          
}
