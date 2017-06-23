import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by zachary on 12/8/16.
 */
public class FXQuestion extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = new Pane();

        StringProperty mouseX = new SimpleStringProperty("0");
        StringProperty mouseY = new SimpleStringProperty("0");

        // Setup labels
        Label xLabel = new Label();
        xLabel.textProperty().bind(mouseX);

        Label yLabel = new Label();
        yLabel.setLayoutX(50);
        yLabel.textProperty().bind(mouseY);

        p.getChildren().addAll(xLabel, yLabel);

        Scene sc = new Scene(p, 300, 300);

        // Setup Click Listener
        sc.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            mouseX.setValue(Double.toString(event.getSceneX()));
            mouseY.setValue(Double.toString(event.getSceneY()));
        });

        primaryStage.setScene(sc);
        primaryStage.setTitle("Mouse Location");
        primaryStage.show();
    }

}
