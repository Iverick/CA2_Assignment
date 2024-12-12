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
public class MultiplicationTable {
    // Task 2: Multiplication Table Using 2D Array
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for multiplication table size
        System.out.println("Enter size of multiplication table:");
        int size = sc.nextInt();
        
        // Create an empty 2D array of required size
        int[][] matrix = new int[size][size];
        
        // Loop through the array fields and populate them with proper values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Display multiplication table output
        System.out.println("Your multiplication table looks the following:");
        DisplayMatrix.displayMatrix(matrix);
    }
}
