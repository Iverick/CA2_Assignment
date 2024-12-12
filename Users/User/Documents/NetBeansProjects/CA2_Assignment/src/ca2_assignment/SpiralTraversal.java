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
public class SpiralTraversal {
    // Task 4: Spiral Traversal of a Matrix
    public static void spiralTraversal() {
        Scanner sc = new Scanner(System.in);
        
        // Ask user for the number of rows and columns in matrix
        System.out.println("Enter number of matrix rows:");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of matrix columns:");
        int cols = sc.nextInt();
        
        // Setup initial variables
        int[][] matrix = new int[rows][cols];
        // Following variables used to track whether we've reached an edge of matrix
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        
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
        
        // Use while loop to iterate through matrix entries until all its fields have been called
        // (e.g. left and right pointers are equal, so are top and bottom pointers)
        System.out.print("Spiral Traversal: ");
        while (left < right && top < bottom) {
            // Iterate over upper row from left to right edges and display its value
            for (int i = left; i < right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            
            // Increase top pointer because we no longer need to go through upper row
            top += 1;
            
            // Iterate over right column to the bottom
            for (int i = top; i < bottom; i++) {
                System.out.print(matrix[i][right - 1] + " ");
            }
            
            // Move right pointer one point left
            right -= 1;
            
            // Break the loop if its already reached an end of matrix
            if (!(left < right && top < bottom)) break;
            
            // Iterate over bottom row from right side to left
            for (int i = right - 1; i > left - 1; i--) {
                System.out.print(matrix[bottom - 1][i] + " ");
            }
            
            // Decrease bottom pointer because we no longer need to go through bottom row
            bottom -= 1;
            
            // Iterate over left column from bottom to top
            for (int i = bottom - 1; i > top - 1; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            
            // Move left pointer one point right 
            left += 1;
            // repeat cycle until we reach the last element in matrix
        }
    }
}
