/* Write a Java program to compare two sets and retain elements which are same on 
both sets       */

import java.util.ArrayList;

public class Q71_PrintPositionOfArrayList {
	
    public static void main(String[] args) {
       
        ArrayList<String> cityNames = new ArrayList<>();

        
        cityNames.add("Rajkot");
        cityNames.add("Ahmedabad");
        cityNames.add("Vadodara");
        cityNames.add("Modasa");
        cityNames.add("Jamnagar");

        
        for (int i = 0; i < cityNames.size(); i++) {
            System.out.println("Position " + i + ": " + cityNames.get(i));
        }
    }
}

