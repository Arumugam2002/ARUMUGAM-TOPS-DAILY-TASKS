/* Write a Java program to get the number of elements in a hash set.                */


import java.util.HashSet;

public class Q58_NumberOfElementsInHashSet {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

      
        hashSet.add("Mercedes");
        hashSet.add("BMW");
        hashSet.add("Rolls Royce");
        hashSet.add("Audi");
        hashSet.add("TATA");
        hashSet.add("Ford");
        hashSet.add("Lamborghini");
        hashSet.add("Porsche");
        

        
        int size = hashSet.size();

       
        System.out.println("Number of elements in HashSet: " + size);
    }
}
