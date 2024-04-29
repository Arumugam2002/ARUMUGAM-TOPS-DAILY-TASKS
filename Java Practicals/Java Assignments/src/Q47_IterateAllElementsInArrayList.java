
/*  Write a Java program to iterate through all elements in an array list.         */

import java.util.ArrayList;
import java.util.Iterator;

public class Q47_IterateAllElementsInArrayList {

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add("Arumugam");
		list.add(1234654);
		list.add(21.2f);
		list.add(201.23);
		list.add("Java");
		list.add(14231);
		list.add("Python");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	
}
