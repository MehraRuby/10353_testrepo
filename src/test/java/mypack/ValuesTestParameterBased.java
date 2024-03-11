package mypack;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValuesTestParameterBased 
{
	private int expected;
	private int first;
	private int second;
	
	public ValuesTestParameterBased(int ex,int f,int s)
	{
		this.expected = ex;
		this.first = f;
		this.second=s;
	}
	
	@Parameters
	public static Collection addNumbers()
	{
		Integer I[][] = {
				{5,2,3},
				{9,4,5},
				{15,7,8},
				{17,8,9}			
						};
		return Arrays.asList(I);
	}
	
	@Test
	public void sum()
	{
		App s = new App();
		System.out.println("Addition with parameters: "+first+" and "+second);
		assertEquals(expected,s.addition(first, second));		
	}		
}
