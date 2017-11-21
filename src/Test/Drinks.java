package Test;


public class Drinks {
     int water=3;
     int cola=5;
     int orangejuice=9;
     int errorKey=0;
     
	public int MyDrinksOrder (int drink) {
		switch (drink) {
		case 1:
			System.out.println("you orderd 1 bottle of water ");
			return water;
		case 2: 
			System.out.println("you orderd 1 bottle of cola");
			return cola;
		case 3: 
			System.out.println(" you orderd 1 bottle of orangejuice");
			return orangejuice;
		default:
			System.out.println("it's ok, you don't have to order something to drink,maybe next time");
			return errorKey;
		}	
	}

}
