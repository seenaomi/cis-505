package Module_6;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public abstract class SeeDivision {

    private String companyName;
    
    private Integer accountNumber;

    /**
     * A method taking two params for a company's division name and account number.
     * @param companyName string
     * @param accountNumber int
     * @return Sets the params to the class fields.
     */

    public SeeDivision(String companyName, Integer accountNumber) {
        this.setCompanyName(companyName);
        this.setAccountNumber(accountNumber);
    } // end constructor

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    // An abstract display() method
    public abstract String display(); 
    
} // end SeeDivision class
