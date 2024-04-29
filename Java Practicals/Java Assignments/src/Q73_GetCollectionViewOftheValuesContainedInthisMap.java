/* Write a Java program to get a collection view of the values contained in this map.
        */


import java.util.*;

public class Q73_GetCollectionViewOftheValuesContainedInthisMap {
	
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 74);
        map.put("B", 41);
        map.put("C", 98);
        map.put("D", 52);
        map.put("E", 21);

       
        Collection<Integer> values = map.values();

        
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
