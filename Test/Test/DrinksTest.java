package Test;

import static org.junit.Assert.*;

import org.junit.Test;


public class DrinksTest {

	@Test
	public void test() {
		//creating an object
		 DrinksTest test1=new DrinksTest();
		 int drink=1;
		 int expected =3;
		
       
			int	output=test1.MyDrinksOrder(int);
		
		assertEquals(expected,output,0);
	}


	}


