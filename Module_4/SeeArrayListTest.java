package Module_4;

import java.util.ArrayList;
import java.util.Scanner;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeArrayListTest {

    /** Return the maximum value in an ArrayList of integers */
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.isEmpty()) return 0;

        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
	}

    // Main method
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter a sequence of numbers ending with 0
		System.out.print("Enter a sequence of numbers ending wih 0: ");
        int num;

        do {
            num = input.nextInt();
            if (num != 0) {
                list.add(num);
            }
        } while (num != 0);

		// Display the largest number in the input and close
		System.out.println("The largest number in the input is " + max(list));
        input.close();
	}// end main
	
} // end class
