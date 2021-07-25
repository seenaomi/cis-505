package Module_8;

/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class SeeEnhancedFutureValueApp extends Application { 

    /**
     * private variables for two TextFields, one TextArea, five Labels, one ComboBox of type Integer, and two Buttons
     */

    private Label lblMonthlyPayment = new Label("Monthly Payment: ");
    private TextField txtMonthlyPayment = new TextField();
    private Label lblInterestRate = new Label("Interest Rate: ");
    private TextField txtInterestRate = new TextField();
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years: ");
    private ComboBox<Integer> intYears = new ComboBox<Integer>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");
    private TextArea txtArea = new TextArea();
    private Label title = new Label("See Future Value App");
    private Label lblFutureValueDate = new Label();
    private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private Date today = Calendar.getInstance().getTime(); 
    private String currentDate = df.format(today);

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
         * Add the controls to the GridPane. For the lblInterestRateFormat label, set the text fill to red and HPos to the right
         */

        pane.add(lblMonthlyPayment, 0, 0);

        pane.add(txtMonthlyPayment, 1, 0);

        pane.add(lblInterestRate, 0, 1);

        pane.add(txtInterestRate, 1, 1);

        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        pane.add(lblInterestRateFormat, 1, 2);

        pane.add(lblYears, 0, 3);

        intYears.setMinWidth(200);
        pane.add(intYears, 1, 3);

        intYears.setPromptText("0");
        intYears.getItems().addAll(1,2,3,4,5);

        /**
         * Add the clear and calculate buttons to an HBox with a spacing of 10 and a padding of 15, 0, 15, and 30
         */

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        actionBtnContainer.setAlignment(Pos.CENTER_RIGHT);
        pane.add(actionBtnContainer, 1, 4);

        pane.add(lblFutureValueDate, 0, 5);

        pane.add(txtArea, 0, 6);

        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle(title.getText()); //Set the primary stages title to “YourLastName Future Value App.”
        primaryStage.show();

        btnCalculate.setOnAction(e -> calculateResults());
        btnClear.setOnAction(e -> clearFormFields());
    }// end start

    private void clearFormFields() {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        lblFutureValueDate.setText("");
        txtArea.setText("");
        intYears.setPromptText("0");
    }

    private void calculateResults() {
        Double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
    	Double rate = Double.parseDouble(txtInterestRate.getText());
        Integer years = intYears.getValue();

        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment,rate,years);
        lblFutureValueDate.setText("Calculation as of " + currentDate);
    	txtArea.setText("The future value is $" + futureValue);
        txtMonthlyPayment.setText(Double.toString(monthlyPayment));
        txtInterestRate.setText(Double.toString(rate));
    } 

    // Main method
    public static void main(String[] args) {
        launch(args);
    }// end main
    
    
}
