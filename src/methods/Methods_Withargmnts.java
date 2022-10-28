package methods;

public class Methods_Withargmnts {

	public static void main(String[] args) {
		login("Raja","05-02-1995",4);
		login("hari","10-05-2000",3);
	}
	
	public static void login(String name,String DOB, int semister)
	{
		System.out.println("Name:"+"     "+name);
		System.out.println("DOB:"+"      "+DOB);
		System.out.println("Semister:"+" "+semister);
		System.out.println("--------------------");
		
	}
}
