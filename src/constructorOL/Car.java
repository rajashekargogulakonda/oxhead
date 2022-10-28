/**
 * 
 */
package constructorOL;

/**
 * @author RajashekarGogulakond
 *
 */
public class Car 
{
	// constructor overloading 
	String name, model,colour;
	double price;
	int capacity;
	public Car(String name,String mdl, String color)
	{
		this.name=name;
		this.model=mdl;
		this.colour=color;
	}
	
	public Car(String name,String mdl, String color, double prce)
	{
		this.name=name;
		this.model=mdl;
		this.colour=color;
		this.price=prce;
	}
	
	public Car(String name,String mdl, String color, double prce, int cpct)
	{
		this.name=name;
		this.model=mdl;
		this.colour=color;
		this.price=prce;
		this.capacity=cpct;
		
	}
	
	public void display()
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("");
	}
	
}
