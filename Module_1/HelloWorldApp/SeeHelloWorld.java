package Module_1.HelloWorldApp;

/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by N. See 2021
*/ 
public class SeeHelloWorld {

    /**
     * Method with two arguments, which are used to print the user's first and last name.
     * @param firstName String 
     * @param lastName String 
     * @return prints the results to the console window.
     */
    public static void myName(String firstName, String lastName) {
        System.out.printf("My name is %s %s", firstName, lastName);
    } // end myName

    public static void main(String args[]) {
        myName("Naomi", "See"); // Call the myName() method with the values "Naomi" and "See."
    } // end main
}