/* Write a Java program to replace the second element of an Array List with the 
specified element.            */



import java.util.ArrayList;

public class Q70_ToReplaceSecondElementInArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");

        
        System.out.println("Original ArrayList: " + arrayList);

        
        String newElement = "June";

        
        if (arrayList.size() >= 2) {
            arrayList.set(1, newElement);
            System.out.println("ArrayList after replacing the second element: " + arrayList);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }
    }
}

