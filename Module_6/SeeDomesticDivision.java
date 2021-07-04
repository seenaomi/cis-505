package Module_6;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeDomesticDivision extends SeeDivision {

    private String divisionState;

    /**
     * A method taking three params for a company's division name, account number, and division state.
     * @param companyName string
     * @param accountNumber int
     * @param divisionCountry string
     * @return Sets the params to the class fields.
     */

    public SeeDomesticDivision(String companyName, Integer accountNumber, String divisionState) {
        super(companyName, accountNumber);
        this.setDivisionState(divisionState);
    } // end constructor

    public String getDivisionState() {
        return divisionState;
    }

    public void setDivisionState(String divisionState) {
        this.divisionState = divisionState;
    }
    
    // An abstract display() method to display field values
    @Override
    public String display() {
        return "\nThe domestic division details are as follows: \nCompany Name: " + this.getCompanyName() + "\nThe related account number is: " + this.getAccountNumber() + "\nThe division is located in the state of: " + this.getDivisionState();
    }
    
} // end SeeDomesticDivision
