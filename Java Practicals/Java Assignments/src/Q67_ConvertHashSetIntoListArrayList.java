/* Write a Java program to convert a hash set to a List/Array List                */


import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Q67_ConvertHashSetIntoListArrayList {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

       
        hashSet.add("Raina");
        hashSet.add("Dhoni");
        hashSet.add("Jadeja");
        hashSet.add("Virat");
        hashSet.add("Rohit");
        hashSet.add("Bumrah");
        hashSet.add("Bhuvi");
        
        

        
        List<String> arrayList = new ArrayList<>(hashSet);

       
        System.out.println("HashSet: " + hashSet);
        System.out.println("ArrayList: " + arrayList);
    }
}
