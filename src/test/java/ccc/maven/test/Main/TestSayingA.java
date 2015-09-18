package ccc.maven.test.Main;
import org.junit.*;
import static org.junit.Assert.*;


public class TestSayingA {
	

	@Test
	public void testA(){
		
		TestA a=new TestA();
		String ss1= a.sayHelloA("A");
		assertEquals(ss1,"package A :A");
		
	}
}
