package GradeBookApp;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    
    private Label lblFirstName= new Label("First Name: ");
    private TextField txtFirstName = new TextField();
    private Label lblLastName= new Label("Last Name: ");
	private TextField txtLastName = new TextField();
    private Label lblCourseName= new Label("Course Name: ");
	private TextField txtCourseName = new TextField();
    private Label lblGrade= new Label("Course Grade: ");
	private ComboBox<String> strGrade =new ComboBox<String>(); 
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


        // Add labels, fields, buttons, and textarea
        
        pane.add(lblFirstName, 0,1);

        pane.add(txtFirstName, 1,1);

        pane.add(lblLastName, 0, 2);

        pane.add(txtLastName, 1, 2);
		
        pane.add(lblCourseName, 0, 3);

        pane.add(txtCourseName, 1, 3);
        
        pane.add(lblGrade, 0, 5);
             
        strGrade.setMaxWidth(200);
        pane.add(strGrade, 1, 5);

        // Add controls

        strGrade.getItems().addAll("- Select a Grade - ", "A", "B", "C", "D", "F");
        strGrade.setValue("- Select a Grade - ");

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnSave);
        actionBtnContainer.getChildren().add(btnView);
        actionBtnContainer.setAlignment(Pos.CENTER);
        pane.add(actionBtnContainer, 1, 6);

        txtArea.setMaxWidth(200);
        pane.add(txtArea, 1, 7);

        Scene scene = new Scene(pane, 325, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle(title.getText()); //Set the primary stages title to “Grade Book App.”
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

        // TODO add event handling for btnSave

    } // end saveResults method

    private void viewResults() {

        // TODO add event handling for btnView

    } // end viewResults method
    
     // Main method
     public static void main(String[] args) {
        Application.launch(args);
    }// end main
}