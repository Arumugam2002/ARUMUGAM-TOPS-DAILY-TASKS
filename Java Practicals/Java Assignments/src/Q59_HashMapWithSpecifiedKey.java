/* Write a Java program to associate the specified value with the specified key in a
Hash Map.
           */

import java.util.HashMap;

public class Q59_HashMapWithSpecifiedKey {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();

        
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Five", 5);
        hashMap.put("Six", 6);
        hashMap.put("Seven", 7);
        

        
        System.out.println("HashMap before adding new entry: " + hashMap);

        
        hashMap.put("Four", 4);

        
        System.out.println("HashMap after adding new entry: " + hashMap);
    }
}
