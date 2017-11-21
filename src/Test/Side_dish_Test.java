package Test;

import static org.junit.Assert.*;

import org.junit.Test;



public class Side_dish_Test {

	@Test
	public void test() {
		
         int side=1;
         int expected =10;
		
		Side_Dish test1=new Side_Dish();
		int output= test1.SideDishOrder(side);
		
		assertEquals(expected,output,0);
	}

}
