

public class food {
	int  burger 	= 20;
	int  steak 		= 30;
	int  pigaletu 	= 40;
	int  typeError	= 0;

	
	public int Myfoodorder (int maincourse) {
	
		switch (maincourse) {
		case 1:
			System.out.println("you orderd 1 burger ");
			return burger;
		case 2: 
			System.out.println("you orderd 1 steak");
			return steak;
		case 3: 
			System.out.println("you orderd 1 pigaletu");
			return pigaletu;
		default:
			System.out.println("it's ok you don't have to order a main course,maybe next time");
			return typeError;
		}
		}


		
	}
	
			
	
