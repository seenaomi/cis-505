package Module_5;

import java.util.ArrayList;
import java.util.Scanner;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeExceptionTest {

    public static void main(String[] args) {

        // ArrayList filled with a minimum of 10 Strings
        ArrayList<String> plantList = new ArrayList<String>();
        plantList.add("Aloe");
        plantList.add("Pothos");
        plantList.add("Air");
        plantList.add("Succulent");
        plantList.add("Orchids");
        plantList.add("Ficus");
        plantList.add("Philodendron");
        plantList.add("Anthurium");
        plantList.add("Cactus");
        plantList.add("Tradescantia");

        // for-each loop to print the ArrayList collection
        System.out.println("The plants we have available are: ");
        for (String plant : plantList) {
            System.out.println(plant);
        }
        
        // Ask a user which element they would like to see again
        System.out.print("Which plant would you be interested in seeing again? ");
        Scanner input = new Scanner(System.in);
        String seeAgain = input.nextLine();

        // Attempt printing the element in a try/catch format which will result in the element being displayed
        try {
            plantList.stream()
            .filter(p -> p.equals(seeAgain))
            .findAny()
            .orElseThrow(Exception::new);
            System.out.println("Here's another look at " + seeAgain);
        } catch(Exception e) { // If the element value received is invalid, display a message that an Exception has been throw displaying “Out of Bounds.”
            System.out.println("An exception has occurred. The value " + seeAgain + " is out of bounds.");
        }
        input.close();
    } //end main
} //end SeeExceptionTest class
