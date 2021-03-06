package GradeBookApp;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import GradeBookApp.Models.Student;
import GradeBookApp.Services.StudentService;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SeeGradeBookApp extends Application {

    /* Include the following fields: first name, last name, course, and grade (use A-F).
       For the grade field use a ComboBox with pre-filled values.
       Use labels to identify the forms fields.
    */
    
    private Label lblFirstName = new Label("First Name: ");
    private TextField txtFirstName = new TextField();
    private Label lblLastName= new Label("Last Name: ");
    private TextField txtLastName = new TextField();
    private Label lblCourseName = new Label("Course Name: ");
    private TextField txtCourseName = new TextField();
    private Label lblGrade = new Label("Course Grade: ");
    private ComboBox<String> strGrade = new ComboBox<String>(); 
    private Button btnClear = new Button("Clear");
    private Button btnSave = new Button("Save");
    private Button btnView = new Button("View");
    private TextArea txtArea = new TextArea();
    private Label title = new Label("Grade Book App");

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Add a new GridPane object
        GridPane pane = new GridPane();

        // Create UI layout

        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        Color c = Color.rgb(184, 222, 199); 
        pane.setBackground(new Background(new BackgroundFill(c, null, null)));
        pane.setHgap(5.5);
        pane.setVgap(5.5);


        // Add labels, fields, buttons, textarea, and controls
        
        pane.add(lblFirstName, 0,1);

        pane.add(txtFirstName, 1,1);

        pane.add(lblLastName, 0, 2);

        pane.add(txtLastName, 1, 2);
		
        pane.add(lblCourseName, 0, 3);

        pane.add(txtCourseName, 1, 3);
        
        pane.add(lblGrade, 0, 5);
             
        strGrade.setMaxWidth(400);
        pane.add(strGrade, 1, 5);

        strGrade.getItems().addAll("- Select a Grade - ", "A", "B", "C", "D", "F");
        strGrade.setValue("- Select a Grade - ");

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnSave);
        actionBtnContainer.getChildren().add(btnView);
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        pane.add(actionBtnContainer, 1, 6);

        txtArea.setMaxWidth(400);
        pane.add(txtArea, 1, 7);

        Scene scene = new Scene(pane, 525, 400);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");
        primaryStage.setScene(scene);
        primaryStage.setTitle(title.getText()); //Set the primary stages title to ???Grade Book App.???
        primaryStage.show();

        btnSave.setOnAction(e -> saveResults());
        btnView.setOnAction(e -> viewResults());
        btnClear.setOnAction(e -> clearFormFields());
    } // end start

    private void clearFormFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtCourseName.setText("");
        txtArea.setText("");
        strGrade.setValue("- Select a Grade - ");
    } // end clearFormFields method

    private void saveResults() {
        if(txtFirstName.getText().isBlank() || txtLastName.getText().isBlank() || txtCourseName.getText().isBlank() || strGrade.getValue().isBlank()) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Student record information is missing or incorrect. Try again.");
            a.getDialogPane().setStyle("-fx-font-family: 'serif'");
            a.show();
        } else {
            Random rand = new Random();
            int rand_int = rand.nextInt(1000);
            String stuId = String.valueOf(rand_int);  
            Student stu = new Student(txtFirstName.getText(),txtLastName.getText(),txtCourseName.getText(),strGrade.getValue(),stuId);
            StudentService.saveStudentRecord(stu);
            clearFormFields();
        }
    } // end saveResults method

    private void viewResults() {   
        txtArea.clear();     
        List<Student> stu = new ArrayList<Student>();
        try {
            stu = StudentService.viewAllStudents();
            for (Student list : stu) {
                txtArea.appendText(list.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("There are no records currently. Please save records to view.");
            a.getDialogPane().setStyle("-fx-font-family: 'serif'");
            a.show();
        }
    } // end viewResults method
    
     // Main method
     public static void main(String[] args) {
        Application.launch(args);
    }// end main
}