/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_assignment;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayCreator {
    // Helper method used to create arrays for tasks 1 and 5
    public static int[] arrayCreator() {
        // Ask user to create an array of specific length
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of an array:");
        int arrLength = sc.nextInt();
        
        // Create an empty array
        int[] inputArray = new int[arrLength];
        
        // Use for loop to ask user to provide numbers and write them into the array
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Please enter an array number:");
            int number = sc.nextInt();
            inputArray[i] = number;
        }
        
        // Display user's array with provided values
        System.out.println("Your array is: ");
        for (int i = 0; i < arrLength; i++) {
            System.out.print(inputArray[i] + " ");
        }
        
        return inputArray;
    }
}
