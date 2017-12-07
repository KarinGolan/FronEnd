package InT;

import org.junit.Test;
import mypackage.CustomerDetails;
import mypackage.Drink;
import mypackage.FoodOrders;
import mypackage.Side_Dish;
import mypackage.food;

public class FoodorderIT {
@Test
public void IntegrationKeyTest() {
	CustomerDetails customer =new CustomerDetails();
	customer.customername("Karin");
	customer.customeraddress("Ricard sorge 24");
	customer.customerPhone(05454271654);
	
	food order= new food();
	order.Myfoodorder(1);
	
	Side_Dish side =new Side_Dish();
	side.SideDishOrder(1);
	
	Drink mydrink =new Drink();
	mydrink.MyDrinksOrder(1);
	
	
}

}
