/**
 * 
 */
package constructorOL;

/**
 * @author RajashekarGogulakond
 *
 */
public class Dog 
{
	//Parameterised Constructor 
	String name;
	String colour;
	
	public Dog(String Dname, String Dcolour)
	{
		name=Dname;
		colour=Dcolour;
	}
	
	public static void main(String[] args)
	{
		Dog f=new Dog("Tomy","White");
		System.out.println("First name of the Dog is: "+ f.name+ " First colour of the dog is: "+f.colour);
		
		Dog f1=new Dog("Snoopy","Brown");
		System.out.println("First name of the dog is: "+ f1.name+ " First colour of the dog is: "+ f1.colour);
		
		Dog f2=new Dog("puppy","Black");
		System.out.println("First name of the dog is: "+ f2.name+ " First colour of the dog is: "+ f2.colour);
	}
	
}
