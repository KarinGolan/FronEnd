

public class Side_Dish {
	int fries=10;
    int sweet_fries=15;
    int pasta=25;
    int errorKey=0;
	public int SideDishOrder (int side) {
		
		switch (side) {
	case 1:
		System.out.println("you orderd 1 fries ");
		return fries;
	case 2: 
		System.out.println("you orderd 1 sweet_fries");
		return sweet_fries;
	
	case 3: 
		System.out.println("you orderd 1 pasta");
		return pasta;
	default:
		System.out.println("it's ok you don't have to order a side-dish,maybe next time");
	}	return errorKey;
	}
}
