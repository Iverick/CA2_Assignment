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
public class DiagonalSum {
    // Task 3: Diagonal Sum of a Matrix
    public static void diagonalSum() {
        System.out.println("");
        System.out.println("Task 3 - Diagonal Sum of a Matrix");
        
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the number of rows and columns in matrix
        System.out.println("Enter number of matrix rows:");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of matrix columns:");
        int cols = sc.nextInt();
        
        // Setup initial variables
        int[][] matrix = new int[rows][cols];
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        // Use loop to populate matrix with user data
        System.out.println("Please enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Display matrix
        System.out.println("Your matrix is:");
        DisplayMatrix.displayMatrix(matrix);
        
        // Loop through matrix to calculate main and secondary diagonal sums
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    mainDiagonalSum += matrix[i][j];
                }
                
                if (j == (cols - i - 1)) {
                    secondaryDiagonalSum += matrix[i][j];
                }
            }
        }
        
        // Display results to the user
        System.out.println("The sum of the main diagonal of this matrix is:");
        System.out.println(mainDiagonalSum);
        System.out.println("The sum of the secondary diagonal of this matrix is:");
        System.out.println(secondaryDiagonalSum);
    }
}
