package mypack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(FastTest.class)
// all methods belongs to faster category
public class TestCaseB {

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}	
}
