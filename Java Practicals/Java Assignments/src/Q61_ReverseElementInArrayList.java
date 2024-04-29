/* Write a Java program to reverse elements in an array list.
                */
import java.util.ArrayList;
import java.util.Collections;

public class Q61_ReverseElementInArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        
        numbers.add(41);
        numbers.add(64);
        numbers.add(20);
        numbers.add(50);
        numbers.add(35);
        
       
        System.out.println("Original ArrayList: " + numbers);
        
        
        Collections.reverse(numbers);
        
        
        System.out.println("Reversed ArrayList: " + numbers);
    }
}

