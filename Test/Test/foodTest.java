package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import mypackage.food;


public class foodTest {

	@Test
	public void test() {
		
		int maincourse=1;
		
		int expected =20;
		
		food test1=new food();
		int output= test1.Myfoodorder(maincourse);
		
		assertEquals(expected,output,0);
	}

}
