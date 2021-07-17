package FutureValueApp;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class SeeFutureValueApp extends Application { 

    @Override
    public void start(Stage primaryStage) throws Exception { 
        /**
         * add a new GridPane object and set its alignment to Pos.CENTER, set its padding to 11.5, 12.5, 13.5, and 14.5. Next, set the panes Hgap to 5.5 and its Vgap to 5.5
         */
        
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        /**
         * private variables for two TextFields, one TextArea, five Labels, one ComboBox of type Integer, and two Buttons
         * Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right
         */

        Label lblMonthlyPayment = new Label("Monthly Payment: ");
        pane.add(lblMonthlyPayment, 0, 1);

        TextField txtMonthlyPayment = new TextField();
        pane.add(txtMonthlyPayment, 1, 1);

        Label lblInterestRate = new Label("Interest Rate: ");
        pane.add(lblInterestRate, 0, 2);

        TextField txtInterestRate = new TextField();
        pane.add(txtInterestRate, 1, 2);

        Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        pane.add(lblInterestRate, 1, 3);

        Label lblYears = new Label("Years: ");
        pane.add(lblYears, 0, 5);

        ComboBox<Integer> intYears = new ComboBox<Integer>();
        intYears.setMinWidth(200);
        pane.add(intYears, 1, 5);

        /**
         * Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30
         */

        Button btnCalculate = new Button("Calculate");
        Button btnClear = new Button("Clear");
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        pane.add(actionBtnContainer, 1, 6);

        TextArea txtArea = new TextArea();
        double prefWidth = 1.0;
        double prefHeight = 1.0;
        txtArea.setPrefSize(prefWidth, prefHeight);
        pane.add(txtArea, 1, 8);

        Scene scene = new Scene(pane, 350, 300);
        primaryStage.setScene(scene);
        Label title = new Label("See Future Value App");
        primaryStage.setTitle(title.getText()); //Set the primary stages title to “YourLastName Future Value App.”
        primaryStage.show();
    }// end start


    // Main method
    public static void main(String[] args) {
        launch(args);
    }// end main
    
}
