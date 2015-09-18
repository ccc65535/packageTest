package ccc.maven.test.Addition;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestSayingB {
	
	@Test
	public void testB(){
		
		TestB b=new TestB();
		String ss2= b.sayHelloB("B");
		assertEquals(ss2,"package B :B");
		
	}
}
