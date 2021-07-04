package Module_6;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeAbstractTest { // also referred to as UseDivision that creates two instances of each of the division subclasses (4 total instances).
    
    public static void main(String[] args) {
        SeeInternationalDivision i1 = new SeeInternationalDivision("Flavors Iceland", 465231, "Iceland", "Icelandic");
        SeeInternationalDivision i2 = new SeeInternationalDivision("Flavors Ghana", 8625431, "Ghana", "English");
        SeeDomesticDivision d1 = new SeeDomesticDivision("Flavors Hollywood", 1315, "California");
        SeeDomesticDivision d2 = new SeeDomesticDivision("Flavors Brooklyn", 63594, "New York");
        
        System.out.println(i1.display());
        System.out.println(i2.display());
        System.out.println(d1.display());
        System.out.println(d2.display());

    }// end main

} // SeeAbstractTest class
