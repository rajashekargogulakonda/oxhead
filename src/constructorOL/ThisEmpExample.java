/**
 * 
 */
package constructorOL;

/**
 * @author RajashekarGogulakond
 *
 */
public class ThisEmpExample {
	
	//Using this keyword
	String name, desig;
	int id, sal;
	
	public ThisEmpExample(String name, String desig, int id,int sal)
	{
		this.name=name;
		this.desig=desig;
		this.id=id;
		this.sal=sal;
			
	}
	
	public void display()
	{
		System.out.println("Name of the employee is:  		" +name);
		System.out.println("Designation of the employee is:	" +desig);
		System.out.println("Id of the employee is :			" +id);
		System.out.println("Salary of the employee is :		" +sal);
		System.out.println("===============next===============");
		
	}
	
	public static void main(String[] args) 
	{
		ThisEmpExample e=new ThisEmpExample("Jhon", "sales executive", 6040444, 15000);
		e.display();
		
		ThisEmpExample e1=new ThisEmpExample("Sam", "sales executive", 6040445,25000);
		e1.display();
	}
	
	
}
