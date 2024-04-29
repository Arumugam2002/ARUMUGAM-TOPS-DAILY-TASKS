/* Write a Java program to check whether a map contains key-value mappings (empty) 
or not           */


import java.util.HashMap;
import java.util.Map;

public class Q68_ToCheckWhetherKeyMappingIsEmptyOrNot {
    
	public static void main(String[] args) {
        
        Map map = new HashMap<>();

        map.put(1, "c");
		
		map.put(2, "c++");
		map.put("java", 3);
		map.put(1.4, "php");
		map.put(true, "python");
		map.put(null, "java");
		
		System.out.println(map);
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map is not empty.");
        }
    }
}
