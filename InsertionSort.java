/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gavin
 */
/*
 * Insertion Sort implementation in Java
 * Demonstrates two variations: one using a basic swap method 
 * and another using an optimized replacement strategy.

 * Author: Gavin
 */
public class InsertionSort {

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) { 
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) { 
                int temp = arr[j]; 
                arr[j] = arr[j - 1]; 
                arr[j - 1] = temp; 
                j--; 
            } 
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
    public static void insertionSortOP(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
    
    public static void insertSortDesc(int arr[]){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 7 ,1};
        System.out.println("Swap method: ");
        insertionSort(arr);   
        System.out.println("\nAscending - Replaced method: ");        
        insertionSortOP(arr);
        System.out.println("\nDescending array: ");        
        insertSortDesc(arr);        
        System.out.println("");
    }
}
