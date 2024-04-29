/* Write a Java program to increase the size of an array list      */


import java.util.ArrayList;

public class Q69_ToIncreaseTheSizeOfArrayList {
    
	public static void main(String[] args) {
       
        ArrayList<Integer> arrayList = new ArrayList<>();

        
        arrayList.add(50);
        arrayList.add(14);
        arrayList.add(64);

        System.out.println("Original ArrayList: " + arrayList);

        
        increaseSize(arrayList, 5); // Increase by 5 elements

        System.out.println("After increasing size: " + arrayList);
    }

    
    public static void increaseSize(ArrayList<Integer> arrayList, int newSize) {
       
        for (int i = 0; i < newSize; i++) {
            arrayList.add(74);
        }
    }
}

