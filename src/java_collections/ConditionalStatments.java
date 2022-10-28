/**
 * 
 */
package java_collections;

import java.util.Scanner;

/**
 * @author RajashekarGogulakond
 *
 */
public class ConditionalStatments {

/*	public static void main(String[] args) {

//WAP to check whether 10 is equal to 20
		int a=10, b=20;

		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a is not equal to b");
		}


//WAP to check whether 10 is +ve or -ve
		int c=10;

		if(c>0)
		{
			System.out.println("the c is positive");
		}
		else if(c<0)
		{
			System.out.println("the c is negative");
		}
		
		else
		{
			System.out.println("the c is neither positive nor negative");
		}
		
		
//		WAP to check whether pooja is eligible to vote or not, pooja's age is 21
		
		int age=18, pooja= 21;
		
		if(pooja>=age)
		{
			System.out.println("Pooja can vote");
		}
		else
		{
			System.out.println("pooja cannot vote");
		}
		

//		WAP to check whether 22 is divided in 4 or not
		
		int d=22;
		
		if(d%4==0)
		{
			System.out.println("the 22 number is divisible by 4");
		}
		else
		{
			System.out.println("the 22 number is not divisible by 4");
		}
		
		
		
//		WAP to check whether 32 is even number or not
		/*
		 * int num=32; if(num%2==0) { System.out.println(num+" num is even number"); }
		 * else { System.out.println(num+" num is not even number"); }
		 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num ");
		int num1=s.nextInt();
		if(num1%2==0)
		{
			System.out.println(num1+" num1 is positive number");
		}
		else
		{
			System.out.println(num1+" num1 is negative number");
		}
		
		
		
		
		
		
	}*/
	
	
//	WAP to find the greatest number 
//	static int biggestOfThree(int x, int y, int z)
//	{
//		if(x>=y && x>=z)
//		{
//			return x;
//		}
//		
//		else if(y>=x && y>=z)
//		{
//			return y;
//		}
//		
//		else
//		{
//			return z;
//		}
//	}
//	public static void main(String[] args) 
//	{
//		int a=10, b=27, c=6, largest;
//		
//		largest=biggestOfThree(a,b,c);
//		System.out.println(largest + " is the greatest number");
//	}
	
	public static void main(String[] args) 
	{
		int num=8;
		if(num%2==0)
		{
			System.out.println(num+ " is divisible in 2 tables");
			System.out.println(num+ " is also even number");
		}
		else
		{
			System.out.println(num+ " is not divisible in 2");
		}
	}
	
	
	
	
}
