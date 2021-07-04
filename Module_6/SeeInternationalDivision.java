package Module_6;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeInternationalDivision extends SeeDivision {

    private String divisionCountry;

    private String divisionSpokenLanguage;

    /**
     * A method taking four params for a company's division name, account number, division country, and division spoken language.
     * @param companyName string
     * @param accountNumber int
     * @param divisionCountry string
     * @param divisionSpokenLanguage string
     * @return Sets the params to the class fields.
     */

    public SeeInternationalDivision(String companyName, Integer accountNumber, String divisionCountry,
            String divisionSpokenLanguage) {
        super(companyName, accountNumber);
        this.setDivisionCountry(divisionCountry);
        this.setDivisionSpokenLanguage(divisionSpokenLanguage);
    } //end constructor


    public String getDivisionSpokenLanguage() {
        return divisionSpokenLanguage;
    }


    public void setDivisionSpokenLanguage(String divisionSpokenLanguage) {
        this.divisionSpokenLanguage = divisionSpokenLanguage;
    }


    public String getDivisionCountry() {
        return divisionCountry;
    }


    public void setDivisionCountry(String divisionCountry) {
        this.divisionCountry = divisionCountry;
    }

     // An abstract display() method to display field values
    @Override
    public String display() {
        return "\nThe international division details are as follows: \nCompany Name: " + this.getCompanyName() + "\nThe related account number is: " + this.getAccountNumber() + "\nThe division is located in the country of: " + this.getDivisionCountry() +  "\nThe division's spoken official language is: " + this.getDivisionSpokenLanguage();
    }
    
}
