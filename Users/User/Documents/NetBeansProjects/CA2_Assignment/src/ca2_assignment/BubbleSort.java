/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_assignment;

/**
 *
 * @author User
 */
public class BubbleSort {
    // Task 5: Bubble Sort - Sorting an Array
    public static void bubbleSort() {
        // Initialize required variables
        int[] inputArray = ArrayCreator.arrayCreator();
        int numOfSwaps = 0;
        
        // Loop through the user array to perform sorting.
        // We need 2 loops for bubble sort - from start to the and from
        // selected element to end.
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                // Check if the element from the left side is greater than the element from the right.
                // Swap their places if that is true
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = temp;
                    numOfSwaps++;
                }
            }
        }
        
        // Loop through the array to display it in sorted order
        System.out.println("");
        System.out.println("Sorted array looks the following: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        
        // Display the number of total swaps performed during sorting
        System.out.println("");
        System.out.println("Total number of swaps made during the sorting: " + numOfSwaps);
    }
}
