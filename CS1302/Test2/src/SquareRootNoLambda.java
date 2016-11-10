import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SquareRootNoLambda extends Application{

    private TextField inputField;
    private TextField outputField;


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox base = new VBox(10);
        base.setPadding(new Insets(10));
        base.setAlignment(Pos.CENTER);


        // Create and configure the Input field
        this.inputField = new TextField();
        // Disallow typing non-numeric characters into the field.
        this.inputField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        // Add label for the input field
        Label inputLabel = new Label();
        inputLabel.setLabelFor(this.inputField);
        inputLabel.setText("Enter a number: ");

        // Create a Row for adding to the base pane later
        HBox inputRow = new HBox();
        inputRow.getChildren().addAll(inputLabel, this.inputField);

        // Create button. Simple enough
        Button computeButton = new Button();
        computeButton.setText("Compute square root");

        // Create and configure the Output field
        this.outputField = new TextField();
        this.outputField.setEditable(false);

        // Create label for the output field
        Label outputLabel = new Label();
        outputLabel.setLabelFor(this.outputField);
        outputLabel.setText("The square root: ");

        // Create a Row for adding to the base pane later
        HBox outputRow = new HBox();
        outputRow.getChildren().addAll(outputLabel, this.outputField);

        //
        //  D: event handler for button
        //
        computeButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double sqrt = Math.sqrt(Double.parseDouble(inputField.getText()));
                outputField.setText(((Double) sqrt).toString());  // Java is obviously not my primary language
            }
        });

        // Add all the view groups to my base group
        base.getChildren().addAll(inputRow, computeButton, outputRow);

        Scene sc = new Scene(base);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Square root calculator");
        primaryStage.show();
    }

}