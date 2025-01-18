// This is a template to build from

import java.util.*;
import java.util.Scanner;

public class UserInputUntilBlank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Enter anything and it will output it. (press Enter without typing to stop):");
        while (true) {
            input = scanner.nextLine(); // Read a line of input
            
            if (input.isBlank()) { // Check if the input is blank
                break; // Exit the loop
            }
            
            System.out.println("You entered: " + input);
            // System.out.println("Data Type: " + input.getClass().getSimpleName());
            if (isInteger(input)) {
                System.out.println("Input is an int");
            } else if (isDouble(input)) {
                System.out.println("Input is a double");
            } else {
                System.out.println("Input is something else");
            }
            // You can process the input here (e.g., add to a list, parse to number, etc.)
        }
        
        System.out.println("Input ended. Thank you!");
        scanner.close(); // Close the scanner to release resources
    }
}

