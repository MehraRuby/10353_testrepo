package mypack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ReverseNumberTestCase {

	long expected;
	long first;
	
	@Rule
	public TestName name = new TestName();
	
	public ReverseNumberTestCase(long ex,long f)
	{
		this.expected = ex;
		this.first = f;
	}
		
	@Parameters
	public static Collection addNumbers()
	{
		Long I[][] = {
				{3212L,2123L},
				{3432L,2343L},
				{4321L,1234L},
				{6576L,6756L}			
						};
		return Arrays.asList(I);
	}
	
	@Test
	public void test() 
	{
		//assertEquals("test",name.getMethodName());
		assertEquals(expected,ReverseNumber.reverse(first));
	}

}
