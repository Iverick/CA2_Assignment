/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_assignment;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class CheckArrayForDuplicates {
    public static String checkArrayForDuplicates() {
        System.out.println("Task 1 -  Array Search – Find the First Repeated Element");
        
        int[] inputArray = ArrayCreator.arrayCreator();
        Set<Integer> helperSet = new HashSet<>();
        
        // Use for loop to iterate over array entries
        for(int i = 0; i < inputArray.length; i++) {
            // Check if a number has already been added to the Set of array numbers.
            // Continue this loop until it founds a duplicate.
            if (helperSet.contains(inputArray[i])) {
                System.out.println("");
                return "First repeated element in your array: " + inputArray[i];
            } else {
                helperSet.add(inputArray[i]);
            }
        }
        
        System.out.println("");
        return "No repeated elements found.";
    }
}
