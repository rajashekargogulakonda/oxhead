package methods;

public class MethodOloading 
{
	//this is executing the method
	public static void main(String[] args) 
	{
		System.out.println("this statement is executing in the main method");
		bookDetails(); 
	}
	
	public static void bookDetails()
	{
		System.out.println("this is about book");
		System.out.println("details of book printing");
	}
}
