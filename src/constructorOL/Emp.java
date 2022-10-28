/**
 * 
 */
package constructorOL;

/**
 * @author RajashekarGogulakond
 *
 */
public class Emp {
	
	//Another example for parameterised constructor
	String name, dseg;
	int Id, sal;
	
	public Emp(String ename, String eDseg,int eId,int esal)
	{
		name=ename;
		dseg=eDseg;
		Id=eId;
		sal=esal;
	}
	
	public void display()
	{
		System.out.println("Name of the employee is         :"+name);
		System.out.println("Designation of the employee is  :"+dseg);
		System.out.println("Employee Id is 			:"+Id);
		System.out.println("Salary of the Employee is 	:"+sal);
	}
	public static void main(String[] args) 
	{
		
		Emp e=new Emp("Ram", "Telecaller", 120, 30000);
		e.display();
		Emp e1=new Emp("Kalyan", "Telecaller", 121, 20000);
		e1.display();
				
	}
	
}
