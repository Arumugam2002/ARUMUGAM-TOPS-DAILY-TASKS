/*  Write a Java program to update specific array element by given element. */


import java.util.Scanner;

public class Q50_UpdateSpecificArrayElement {
   
	public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.print("Original array: ");
        printArray(arr);

      
        System.out.print("Enter the index you want to update: ");
        int index = scanner.nextInt();

        
        if (index < 0 || index >= size) {
            System.out.println("Invalid index! It should be between 0 and " + (size - 1));
            scanner.close();
            return;
        }

        
        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();

       
        arr[index] = newValue;

        
        System.out.print("Updated array: ");
        printArray(arr);

        
        scanner.close();
    }

    
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

