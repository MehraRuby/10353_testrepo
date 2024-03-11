package mypack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
    App obj=new App();    
    int ad1 = obj.add(2, 3);
    int testval1=5;
        
    
    int ad2 = obj.add(4, 3);
    int testval2=7;
    
    
    int ad3 = obj.add(4, 4);
    int testval3=8;
    
    
    int ad4 = obj.add(5, 5);
    int testval4=10;
    
        	  
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
      
    @Test
    public void testAdd1()
    {
    	assertEquals(testval1,ad1);
    }
    
    @Test
    public void testAdd2()
    {
    	assertEquals(testval2,ad2);
    }
    

    @Test
    public void testAdd3()
    {
    	assertEquals(testval3,ad3);
    }
    
    
    @Test
    public void testAdd4()
    {
    	assertEquals(testval4,ad4);
    }
    
    
    
    
    
    
    @Test
    public void testCase1()
    {
    	assertEquals(true,App.isEquals(9, 9));    	
    }
    
        
    
    @Test
    public void testCase2()
    {
    	assertEquals(true,App.isEquals(7, 7));    	
    }
    
    
    @Test
    public void testCase3()
    {
    	assertEquals(false,App.isEquals(-9, 9));    	
    }
    
    @Test
    public void testCase4()
    {
    	assertEquals(false,App.isEquals(7, -7));    	
    }
    
    
   /* @Before
    public void beforeTestCase()
    {
    	System.out.println("Pre-Work before TestCase");
    }
    
    @After
    public void afterTestCase()
    {
    	System.out.println("Post-Work after TestCase");
    }*/
    
    
    @Test
    public void testEven1()
    {
    	assertTrue(App.isEven(90));
    }
    
    
    @Test
    public void testEven2()
    {
    	assertTrue(App.isEven(89));
    }
    
    
 
    
    
}
