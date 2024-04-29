
/*  Write a Java program to compare two array lists.
     */



import java.util.ArrayList;

public class Q63_CompareTwoArrayList {
    public static void main(String[] args) {
       
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
       
        list1.add(15);
        list1.add(31);
        list1.add(43);
        
       
        list2.add(65);
        list2.add(12);
        list2.add(32);
        
       
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
       
        boolean isEqual = list1.equals(list2);
        
        
        if (isEqual) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("Both ArrayLists are not equal.");
        }
    }
}

