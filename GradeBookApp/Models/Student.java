package GradeBookApp.Models;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class Student {

    private String firstName;
    private String lastName;
    private String courseName;
    private String grade;
    private String studentId;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Student() {

    }// end conductor that takes no params

    public Student(String firstName, String lastName, String courseName, String grade, String studentId) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setCourseName(courseName);
        this.setGrade(grade);
        this.setStudentId(studentId);
    }// end conductor that takes all params

    @Override
    public String toString() {
        return  "Student " + this.studentId + ": " + this.firstName + " " + this.lastName + ", Course: " + this.courseName + ", Grade: " + this.grade + "\n";
    } // end toString method
    
}
