/* Write a Java program of swap two elements in an array list       */



import java.util.ArrayList;
import java.util.Collections;

public class Q64_SwapOfList {
    public static void main(String[] args) {
       
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        
        System.out.println("ArrayList before swapping: " + arrayList);

        
        int index1 = 1;
        int index2 = 3;
        swap(arrayList, index1, index2);

        
        System.out.println("ArrayList after swapping: " + arrayList);
    }

    public static <T> void swap(ArrayList<T> list, int index1, int index2) {
        
        Collections.swap(list, index1, index2);
    }
}
