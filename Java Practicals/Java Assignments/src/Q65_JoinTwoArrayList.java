/*  Write a Java program to join two array lists.                 */


import java.util.ArrayList;
import java.util.List;

public class Q65_JoinTwoArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        
        list1.add(113);
        list1.add(234);
        list1.add(311);

       
        list2.add(434);
        list2.add(562);
        list2.add(614);

        
        List<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        
        System.out.println("Joined ArrayList: " + joinedList);
    }
}

