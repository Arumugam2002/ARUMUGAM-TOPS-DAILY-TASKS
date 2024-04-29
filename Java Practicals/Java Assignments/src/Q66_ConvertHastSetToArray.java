/* Write a Java program to convert a hash set to an array         */

import java.util.*;

public class Q66_ConvertHastSetToArray {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

        
        hashSet.add("Aman");
        hashSet.add("Sumit");
        hashSet.add("Vineet");
        hashSet.add("Yash");
        hashSet.add("Parth");
        hashSet.add("Keval");
        
        

        
        String[] array = hashSet.toArray(new String[hashSet.size()]);

      
        System.out.println("Elements of the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
