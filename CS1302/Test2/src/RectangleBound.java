import javafx.application.Application;
import javafx.beans.value.ObservableIntegerValue;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleBound extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane p = new Pane();

        Rectangle rect = new Rectangle();
        // *A* set the fill color of rect to light sky blue
        rect.setFill(Color.LIGHTSKYBLUE);
        // *B* set the outline color of rect to deep sky blue
        rect.setStroke(Color.DEEPSKYBLUE);
        // *C* set the width of the outline of rect to 5
        rect.setStrokeWidth(5);

        p.getChildren().add(rect);

        // *D* bind the x property of rect to one fourth the width of the pane p
        rect.xProperty().bind(p.widthProperty().divide(4));

        // *E* bind the y property of rect to one fourth the height of the pane p
        rect.yProperty().bind(p.heightProperty().divide(4));

        // *F* bind the width property of rect to one half the width of the pane p
        rect.widthProperty().bind(p.widthProperty().divide(2));

        // *G* bind the height property of rect to one half the width of the pane p
        rect.heightProperty().bind(p.heightProperty().divide(2));

        Scene sc = new Scene(p, 300, 300);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Bound Rectangle");
        primaryStage.show();
    }
}