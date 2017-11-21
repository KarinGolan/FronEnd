package Test;

import static org.junit.Assert.*;

import org.junit.Test;



public class DrinksTest {

	@Test
	public void test() {
		int drink=1;
        int expected =3;
		
        Drinks test1=new Drinks();
		int output= test1.MyDrinksOrder(drink);
		
		assertEquals(expected,output,0);
	}

}
