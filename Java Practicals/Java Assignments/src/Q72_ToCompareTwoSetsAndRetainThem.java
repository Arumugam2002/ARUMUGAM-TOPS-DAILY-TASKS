/* Write a Java program to compare two sets and retain elements which are same on 
both sets           */


import java.util.HashSet;
import java.util.Set;

public class Q72_ToCompareTwoSetsAndRetainThem {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(41);
        set1.add(64);
        set1.add(71);

        Set<Integer> set2 = new HashSet<>();
        set2.add(71);
        set2.add(41);
        set2.add(20);

        
        set1.retainAll(set2);

        
        System.out.println("Common elements between set1 and set2: " + set1);
    }
}
