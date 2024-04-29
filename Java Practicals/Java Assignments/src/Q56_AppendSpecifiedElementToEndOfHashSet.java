/*  Write a Java program to append the specified element to the end of a hash set.
       */


import java.util.HashSet;

public class Q56_AppendSpecifiedElementToEndOfHashSet {
    public static void main(String[] args) {
       
        HashSet<String> myHashSet = new HashSet<>();

        
        myHashSet.add("Rahul");
        myHashSet.add("Nikhil");
        myHashSet.add("Punneet");

        
        System.out.println("HashSet before addition: " + myHashSet);

        
        appendToHashSet(myHashSet, "Vikram");

        
        appendToHashSet(myHashSet, "Yogesh");

       
        System.out.println("HashSet after additions: " + myHashSet);
    }

   
    public static void appendToHashSet(HashSet<String> set, String element) {
        
        if (set.add(element)) {
            System.out.println(element + " has been added to the HashSet.");
        } else {
            System.out.println(element + " could not be added (duplicate not allowed).");
        }
    }
}

