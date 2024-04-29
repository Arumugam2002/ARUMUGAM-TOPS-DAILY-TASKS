/*  
 Write a Java program to create a new array list, add some colors (string) and print out 
the collection. 
                
                   */

import java.util.ArrayList;

public class Q46_CreateNewArrayListAddSomeColorsAndPrintOutTheCollection {

	
	public static void main(String[] args)
	{
		ArrayList<String> colorList = new ArrayList<String>();
		
		colorList.add("Green");
		colorList.add("Red");
		colorList.add("Yellow");
		colorList.add("Blue");
		colorList.add("Brown");
		colorList.add("Violet");
		colorList.add("Green");
		colorList.add("Cyan");
		colorList.add("Black");
		
		System.out.println(colorList);
	}
	
}
