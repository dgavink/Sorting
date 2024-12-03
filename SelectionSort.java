/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

    // Method to perform selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current index has the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }
            // Swap the smallest element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to calculate the sum of all elements in the array
    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num; 
        }
        return sum;
    }

    // Method to remove an element from the array
    static int[] removeElement(int[] arr, int elementToRemove) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != elementToRemove) {
                list.add(num); // Add only elements that are not equal to the one to remove
            }
        }
        // Convert the updated list back to an array
        int[] modifiedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            modifiedArray[i] = list.get(i);
        }
        return modifiedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input array size and values
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 2: Sort the array
        selectionSort(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Step 3: Calculate and display the sum of array elements
        int sum = calculateSum(arr);
        System.out.println("\nSum of values: " + sum);

        // Step 4: Remove an element from the array
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();
        int[] modifiedArray = removeElement(arr, elementToRemove);

        // Display the modified array
        System.out.println("New Array:");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }
}


