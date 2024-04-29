/*  Write a Java program to insert an element into the array list at the first position.
            */

import java.util.ArrayList;
import java.util.Iterator;

public class Q48_InsertElementIntoArrayListAtFirstPosition {

	public static void main(String[] args)
	{
		ArrayList<String> vegetableList = new ArrayList<String>();
		
		vegetableList.add("Tomato");
		vegetableList.add("Potato");
		vegetableList.add("Onion");
		vegetableList.add("Spinach");
		vegetableList.add("Bottleguard");
		
		
		System.out.println("Vegetable List before Insertion:- ");
		
		Iterator  itr = vegetableList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Item has been added to first position with index 0
		vegetableList.add(0, "Carrot");
		
		Iterator  itr1 = vegetableList.iterator();
		
		System.out.println("\nVegetable List after Insertion:- ");
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}
	
	
}
