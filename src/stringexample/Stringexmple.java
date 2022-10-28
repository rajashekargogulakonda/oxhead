/**
 * 
 */
package stringexample;

/**
 * @author RajashekarGogulakond
 *
 */
public class Stringexmple {
	
	public static void concat1(String s1)
	{
		s1= s1 + "forgeeks";
	}
	
	public static void concat2(StringBuilder s2)
	{
		s2.append("forgeeks");
	}
	public static void concat3(StringBuffer s3)
	{
		s3.append("forgeeks");
	}
	public static void main(String[] args) {
		
		//string value is immutable
	//	String s1=new String("geeks");	
		String s1="geeks";
		concat1(s1);
		System.out.println("String : "+s1);
		
		//StringBuilder is mutable
		StringBuilder s2=new StringBuilder("geeks");
		concat2(s2);
		System.out.println("StringBuilder : "+s2);
		
		//StringBuffer is mutable
		StringBuffer s3=new StringBuffer("geeks");
		concat3(s3);
		System.out.println("StringBuffer : "+ s3);
	}	
	
}
