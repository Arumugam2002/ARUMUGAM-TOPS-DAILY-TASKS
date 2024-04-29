/*  Write a Java program to iterate through all elements in a hash list.         */ 


import java.util.ArrayList;
import java.util.Iterator;

public class Q57_IterationOfHashList {
	
    public static void main(String[] args) 
    {
        
        ArrayList<String> hashList = new ArrayList<>();

       
        hashList.add("Apple");
        hashList.add("Banana");
        hashList.add("Orange");
        hashList.add("Grapes");
        hashList.add("Mango");

       
        System.out.println("Iterating through the hash list using Iterator:");
        
        Iterator<String> iterator = hashList.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
    }
}
