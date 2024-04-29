/*  Write a Java program to extract a portion of an array list.        */

import java.util.ArrayList;
import java.util.List;

public class Q62_ExtractPortionOfArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Riya");
        originalList.add("Neha");
        originalList.add("Sudha");
        originalList.add("Radha");
        originalList.add("Reema");
        
        
        System.out.println("Original ArrayList: " + originalList);
        
        
        int fromIndex = 1; 
        int toIndex = 4;  
        List<String> extractedPortion = originalList.subList(fromIndex, toIndex);
        


        System.out.println("Extracted Portion: " + extractedPortion);
    }
}

