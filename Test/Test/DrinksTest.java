package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import mypackage.Drink;


public class DrinksTest {

	@Test
	public void test() {
		//creating an object
		Drink test1=new Drink();
		 int drink=2;
		 int expected =3;
		
       
			int	output=test1.MyDrinksOrder(drink);
		
		assertEquals(expected,output,0);
	}


	}


