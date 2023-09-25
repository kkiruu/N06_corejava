package org.tnsif.reveseorder;
import java.util.*;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Step 1: Read the value of n
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();

        // Step 2: Read the numbers said by Pinky
        System.out.println("Numbers said by Pinky");
        int[] pinkyNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            pinkyNumbers[i] = scanner.nextInt();
        }

        // Step 3: Read the numbers said by Mary
        System.out.println("Numbers said by Mary");
        int[] maryNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            maryNumbers[i] = scanner.nextInt();
        }

        // Step 4: Check if Mary's numbers are in reverse order compared to Pinky's numbers
        boolean isReverseOrder = true;
        for (int i = 0; i < n; i++) {
            if (maryNumbers[i] != pinkyNumbers[n - 1 - i]) {
                isReverseOrder = false;
                break;
            }
        }

        // Step 5: Output the result
        if (isReverseOrder) {
            System.out.println("Yes, it is in reverse order");
        } else {
            System.out.println("No, it is not in reverse order");
        }

        // Close the scanner
        scanner.close();
    }


	}


