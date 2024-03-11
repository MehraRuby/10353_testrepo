package mypack;



import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;


@Ignore
public class ArrayObjectTest {

	String[] ar1= {"pen","pencil","bags"};
	String[] ar2= {"pen","pencil","bags","paper","eraser"};
	
	@Test
	public void arrayTest()
	{			
		assertArrayEquals(ar1,ArrayTest.values());									
	}

	
	@Ignore
	@Test
	public void arrayAddTest()
	{			
		assertArrayEquals(ar2,ArrayTest.addValues());									
	}

}
