/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_assignment;

/**
 *
 * @author User
 */
public class DisplayMatrix {
    public static void displayMatrix(int[][] matrix) {
        // Helper method iterates over matrix fields and displays their values on the screen
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
