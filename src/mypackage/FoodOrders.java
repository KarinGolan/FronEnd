package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class FoodOrders {

	public static void main(String[] args ) throws IOException, InterruptedException {
		BufferedReader in;
	    PrintWriter out;
		Scanner input = new Scanner(System.in);
		String var1;
		int var2;
		double total_cost = 0;
		CustomerDetails customer =new CustomerDetails();
		food foodobject= new food();
		Side_Dish Side_Dishobject= new Side_Dish();
		Drink Drinksobject= new Drink();
		//VAT Vatobject =new VAT();
		//Revenue revenueobject = new Revenue();
		
		System.out.println("Welcome to our online restaurant, to start with your order please enter your details");
		
		
//asking for name 
		        System.out.println("Enter your Full name ?");
		        var1 =input.nextLine();
		        customer.customername(var1);
		 
//asking for address	
				System.out.println("Enter your full address ?");
				var1 = input.nextLine();
				customer.customeraddress(var1);	
		
//asking for a phone number
				System.out.println("Enter your phone number ?");
				var2 = input.nextInt();
				customer.customerPhone(var2);
				

//asking details about the maincourse
				System.out.println("what would you like to order for a main course: press 1 for burger (20 NIS), 2 for steak (30 NIS), and 3 for pigaleto (40 NIS)");
				var2 = input.nextInt();
				total_cost = total_cost + foodobject.Myfoodorder(var2);
				

//asking details about the side-dish
				System.out.println("what would you like to order as a side-dish: press 1 for fries (10 NIS), 2 for sweet_fries (15 NIS), and 3 for pasta (25 NIS)");
				var2 = input.nextInt();
				total_cost = total_cost + Side_Dishobject.SideDishOrder(var2);
			
//asking details about drink order
				System.out.println("what would you like to order as a drink: press 1 for water (3 NIS), 2 for cola (5 NIS), and 3 for orangejuice (9 NIS)");
				var2 = input.nextInt();
				total_cost = total_cost + Drinksobject.MyDrinksOrder(var2);
								
			System.out.println("Hi, " + customer.mama() + " your order will arrive to " + customer.dada() + " whitin an hour, enjoy your meal");

		    Socket socket = new Socket("my.backend.com.",8080);
	        in = new BufferedReader(
	                new InputStreamReader(socket.getInputStream()));
	        out = new PrintWriter(socket.getOutputStream(), true);
	        out.println(total_cost);
	        String response;
            try {
                response = in.readLine();
                if (response == null || response.equals("")) {
                      System.exit(0);
                  }
            } catch (IOException ex) {
                   response = "Error: " + ex;
            }
            System.out.println("The total cost is : "+response);
			
			//total_cost=Vatobject.totalWithVat(total_cost);
			
			

			/* Process proc = Runtime.getRuntime().exec( "java -jar C:\\FinalProject\\BackEnd.jar "+total_cost);
			 proc.waitFor();
			 InputStream in = proc.getInputStream();
			 InputStream err = proc.getErrorStream();
			   byte[] b=new byte[in.available()];
			    in.read(b,0,b.length);
			    System.out.println(new String(b));
			    byte c[]=new byte[err.available()];
			    err.read(c,0,c.length);
			    System.out.println(new String(c));*/
			  
			
			
			
			
			//total_cost= maincourse+side+drink;
				//total_cost=Vatobject.totalWithVat(total_cost);
				//revenueobject.myRevenue(total_cost);
				
				
				
			
				}

	}		
				
				

	

