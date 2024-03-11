package mypack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCaseA {

	@Test
	public void a() {
		fail("Not yet implemented");
	}
	
	@Category(SlowTest.class)
	@Test
	public void b() {
		System.out.println("b method");
	}	
}
