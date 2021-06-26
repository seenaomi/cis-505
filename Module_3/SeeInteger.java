package Module_3;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeInteger {

    private int naomi;

    /**
     * Constructor that takes one param called naomi and sets it to the class variable also called naomi.
     *
     * @param naomi int
     */
    public SeeInteger(int naomi) {
        this.naomi = naomi;
    }  //end constructor method

    public int getNaomi() {
        return naomi;
    }

    public void setNaomi(int naomi) {
        this.naomi = naomi;
    }
    
    /**
    * Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
    * @param num int
    * @return boolean
    */  
    public boolean isEven() {
        return (naomi % 2 == 0);
    }

    public boolean isOdd() {
        return (naomi % 2 != 0);
    }

    public boolean isPrime() {
        if (naomi % 2 == 0) {
            return false;
        } 
        else {
            for (int i = 3; i*i <= naomi; i += 2) {
                if (naomi % i == 0) {
                    return false;
                }
            }
        }
        return true;
    } // end non-static methods

    /**
    * Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
    * @param num int
    * @return boolean
    */  
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isPrime(int num) {
        if (num % 2 == 0) {
            return false;
        } 
        else {
            for (int i = 3; i*i <= num; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }// end int methods

    /**
    * Static methods with signatures isEven(SeeInteger), isOdd(SeeInteger), and isPrime(SeeInteger) with the same basic logic as the previous methods with results based on the parameter.
    * @param num int
    * @return boolean
    */    
    public static boolean isEven(SeeInteger num) {
        return num.isEven();
    }

    public static boolean isOdd(SeeInteger num) {
        return num.isOdd();
    }

    public static boolean isPrime(SeeInteger num) {
        return num.isPrime();
    }//end SeeInteger methods

    /**
    * Methods equals(int) and equals(Integer) which returns true if int values are equal and false if they are not.
    * @param num int
    * @return boolean
    */    
    public boolean equals(int num) {
        return (num == naomi);
    } 
    
    public boolean equals(SeeInteger num) {
        return (num.naomi == this.naomi);
    } //end equals

     /** 
      * Main test method 
      */
    public static void main(String[] args) {
        SeeInteger int1 = new SeeInteger(863);
        SeeInteger int2 = new SeeInteger(2);
        SeeInteger int3 = new SeeInteger(863);

        System.out.printf("%d is prime? %s%n", int1.getNaomi(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getNaomi(), int2.isPrime());

        System.out.printf("%d is even? %s%n", int1.getNaomi(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getNaomi(), int2.isEven());

        System.out.printf("5 is odd? %s%n", SeeInteger.isOdd(5));
        
        System.out.printf("%d equals %d? %s%n", int1.getNaomi(), int3.getNaomi(), int1.equals(int3));

    } //end main

}
