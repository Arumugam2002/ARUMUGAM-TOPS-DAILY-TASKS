
/*  Write a Java program to sort a given array list.   */

import java.util.ArrayList;

import java.util.Collections;

public class Q53_ProgramToSortElementsInArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(52);
		numbersList.add(74);
		numbersList.add(63);
		numbersList.add(10);
		numbersList.add(40);
		numbersList.add(35);
		numbersList.add(73);
		
		System.out.println("ArrayList Before Sorting:- " + numbersList);
		
		Collections.sort(numbersList);
		
		System.out.println("ArrayList After Sorting:- " + numbersList);
		
	}
	
	
}
