package Module_2.EnhancedFanApp;

import java.util.HashSet;
import java.util.Set;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class TestUseFans {
    /*
      Adapted test to work with UseFans class.
      The below creates three fan objects to create a collection of fans.
      Test sends single object f3 through the DisplayFanFunctionality method to confirm returns a single instance.
      Test then sends the collection of fans to the DisplayFansFunctionality to confirm returns the collection entirely.
    */
    public static void main(String args[]) {
        UseFans f1 = new UseFans();
        UseFans f2 = new UseFans(2, true, 15, "purple");
        UseFans f3 = new UseFans(0, false, 83, "green");

        Set<UseFans> fans = new HashSet<UseFans>();
        fans.add(f1);
        fans.add(f2);
        fans.add(f3);

        UseFans test = new UseFans();

        test.DisplayFanFunctionality(f3);
        test.DisplayFansFunctionality(fans);
    } //end main

}//end TestUseFans class
