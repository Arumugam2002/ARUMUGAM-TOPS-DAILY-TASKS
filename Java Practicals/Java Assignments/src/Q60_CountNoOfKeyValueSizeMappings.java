/* Write a Java program to count the number of key-value (size) mappings in a map.
         */
import java.util.HashMap;
import java.util.Map;

public class Q60_CountNoOfKeyValueSizeMappings {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

       
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);
        

        int size = map.size();

       
        System.out.println("Size of the map: " + size);
    }
}
