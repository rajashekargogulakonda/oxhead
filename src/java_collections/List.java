package java_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class List {

	public static void main(String[] args) {
				//ArrayList with generics
//				ArrayList<Integer> al=new ArrayList<>();
//				al.add(240);
//				al.add(890);
//				al.add(230);
//				System.out.println("Integer values of:"+al);
//				
//				ArrayList<String> al1=new ArrayList<>();
//				al1.add("Hello");
//				al1.add("World");
//				System.out.println("String words of"+al1);
//				
//				ArrayList<Object> al2=new ArrayList<>();
//				al2.add(al);
//				al2.add(al1);
//				System.out.println("Objects of"+al2);
//				
//				//for each loop
//				for(Object data:al2)
//				{
//					System.out.println("for each loop"+data);
//				}

		//	List Iterator
		//		ArrayList<Character> al1=new ArrayList<>();
		//		al1.add('M');
		//		al1.add('o');
		//		al1.add('m');
		//		System.out.println("objects in forward direction");
		//		ListIterator li=al1.listIterator();
		//		while(li.hasNext())
		//		{
		//			System.out.println(li.next());
		//		}
		//		System.out.println("Objects in backword direction");
		//		
		//		while(li.hasPrevious())
		//		{
		//			System.out.println(li.previous());
		//		}
		//		


//				HashSet s=new HashSet();
//				s.add("hi");
//				s.add(123);
//				s.add(18.3);
//				
//				Iterator i=s.iterator();
//				while(i.hasNext())
//				{
//					System.out.println(i.next());
//				}
//				
//		// Linked Hash Set
//		LinkedHashSet lhs=new LinkedHashSet();
//		lhs.add("yash");
//		lhs.add("Prashanth");
//		lhs.add("Anandh");
//		lhs.add("Balu");
//		lhs.add("Hasina");
//		System.out.println("Linked hash set output"+lhs);
				
				TreeSet ts=new TreeSet();
//				ts.add("hi");
//				ts.add("this is chitti");
//				ts.add("the robo");
				
//				ts.add('i');
//				ts.add('h');
//				ts.add('u');
//				
//				ts.add(623);
//				ts.add(459);
//				ts.add(170);
//				ts.add(258);
//				System.out.println("TreeSet objects are"+ts);

//		//Hashmap gives output in random way
//		HashMap<String, Integer> m= new HashMap<>();
//		m.put("Hari",12000);
//		m.put("Shankar", 24000);
//		m.put("fahadh", 35000);
//		m.put("Tom", 40000);
//		m.put("pushpa", 12000);
//		m.put("Hari", 50000);
//		m.put("", null);
//		System.out.println(m);
		
		//Linked hash map gives output in order provided
//		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
//		lhm.put("Hari",12000);
//		lhm.put("Shankar", 24000);
//		lhm.put("Fahadh", 35000);
//		lhm.put("Tom", 40000);
//		lhm.put("Pushpa", 12000);
//		lhm.put("Hari", 50000);
//		lhm.put("", null);
//		System.out.println("Linked hash map output"+lhm);
		
		//Tree Map gives output in alphabetical order and no 2 or more null keys allowed 
//		TreeMap<String, Integer> tm=new TreeMap<>();
//		tm.put("Hari",12000);
//		tm.put("Shankar", 24000);
//		tm.put("Fahadh", 35000);
//		tm.put("Tom", 40000);
//		tm.put("Pushpa", 12000);
//		tm.put("Hari", 50000);
//		tm.put("", null);
//		tm.put("", 15000);
//		System.out.println("Tree map output"+tm);
		
		
	}
	
	


}
