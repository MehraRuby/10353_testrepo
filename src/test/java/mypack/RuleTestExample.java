package mypack;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class RuleTestExample {

	
	@Rule
	public TestName name = new TestName();
	
		
	@Test
	public void test7() 
	{
		System.out.println(name.getMethodName());
		assertEquals("test7",name.getMethodName());		
	    assertEquals(true,App.isEquals(7, 9));    	
	   
	}
	
	@Test
	public void test2() 
	{
		System.out.println(name.getMethodName());
		assertEquals("test2",name.getMethodName());
		assertEquals(true,App.isEquals(-9, -9));  
	}

}
