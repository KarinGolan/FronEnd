package mypackage;


public class CustomerDetails {
	private String myAddress;
	private String myName;

	//metod 1-customer name
	public void customername(String name) 
	{
		myName = name;
		System.out.println ("hello " + name + " ,thank you for choosing as ");
	}
		
	//metod 2-address name
	public void customeraddress(String address) 
	{
		myAddress = address;
	}
		
	//metod 3-phone number
	public void customerPhone(int phone) 
	{
		System.out.println ("Thank you for your details , lets start with the order" );
	}
			
	public String mama()	
	{
		return myName;
	}
		
    public String dada()	
	{
		return myAddress;
		
	}
	
}