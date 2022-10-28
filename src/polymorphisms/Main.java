/**
 * 
 */
package polymorphisms;

/**
 * @author RajashekarGogulakond
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal=new Animal();
		Animal dog=new Dog();
		Animal cat=new Cat();
		animal.animalsound();
		dog.animalsound();
		cat.animalsound();
	}

}
