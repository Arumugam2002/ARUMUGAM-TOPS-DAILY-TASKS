/*   Write a Java program to shuffle elements in an array list.          */




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q55_ShuffleArrayListProgram {
    public static void main(String[] args) {
       
        List<Integer> numbers = new ArrayList<>();

        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        
        System.out.println("Original List: " + numbers);

        
        Collections.shuffle(numbers);

        
        System.out.println("Shuffled List: " + numbers);
    }
}

