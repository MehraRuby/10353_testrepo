package mypack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class StringTest {

	@Test
	public void stringTest() 
	{
		assertThat(StringExample.greet("Jack"),is("Good Morning ! Jack"));		
	}
	
	@Test
	public void allFunctions()
	{
		String obj1 = "junit";
		String obj2 = "junit";
		
		String obj3="test";
		String obj4="test";
		
		String obj5=null;
		
		int val1 = 90;
		int val2 = 100;
		
		boolean isEven=(val1%2==0?true:false);
		
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,4,5};
		
		assertEquals(obj1,obj2);
		//assertSame(obj1,obj3);
		
		assertNull(obj5);
		//assertNull(obj3);
		
		assertNotNull(obj3);		
		assertArrayEquals(arr1,arr2);		
		assertNotEquals(val1,val2);		
		assertTrue(isEven);
											
	}		
}
