package GradeBookApp.Services;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

import java.io.*;
import GradeBookApp.Models.Student;
import java.util.*;

public class StudentService {

    private static File file = new File("GradeBookApp/grades.csv"); // determine file save location and name

    public StudentService() throws IOException {
        if(!file.exists()) {
            createStudentRecordFile();
        }
    } // end conductor

    public static void saveStudentRecord(Student stu) {
        String lineSeparator = System.getProperty("line.separator");
        String newStudent = stu.getFirstName() + "," + stu.getLastName() + "," + stu.getCourseName() + "," + stu.getGrade() + "," + stu.getStudentId();

        try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(lineSeparator + newStudent);
                    writer.close();
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }// end saveStudentRecord

    public static List<Student> viewAllStudents() throws IOException {
        List<Student> stu = new ArrayList<Student>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            String line;
            
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                stu.add(new Student(row[0], row[1], row[2], row[3], row[4]));
            }
            reader.close();

        return stu;

        }

    }// end viewAllStudents

    private void createStudentRecordFile() throws IOException {
        file.createNewFile();
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("FirstName,LastName,CourseName,Grade,StudentId");
            writer.close();
        }
    }// end createStudentRecordFile

}
