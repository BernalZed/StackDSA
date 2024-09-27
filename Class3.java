
package com.mycompany.stackdsa;

import java.util.HashSet;
import java.util.Set;


public class Class3 extends Class1 {

    // Constructor to call the parent class constructor
    public Class3(int Size) {
        super(Size);
    }

    // Method to remove duplicates from the stack
    public void removeDup() {
        Set<Double> remove = new HashSet<>(); // Set to store unique values
        int newTop = -1;
        boolean hasDuplicate = false;

        // Iterate over the stack
        for (int i = 0; i <= top; i++) {
            if (!remove.contains(Stack[i])) { // If the element is not in the set
                remove.add(Stack[i]); // Add to the set
                Stack[++newTop] = Stack[i]; // Move the element to the new stack position
            } else {
                hasDuplicate = true; // Mark if there's a duplicate
            }
        }

        top = newTop; // Update the top pointer to the new top

        // Display if duplicates were found or not
        if (hasDuplicate) {
            System.out.println("DUPLICATES REMOVED.");
        } else {
            System.out.println("NO DUPLICATES DETECTED.");
        }
    }
}
        
    
    

