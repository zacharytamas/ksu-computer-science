import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class AddSquares extends Application {


    private static final Color BACK_COLOR = Color.BEIGE;
    private static final double SQUARE_SIDE = 10;
    private static final Color SQUARE_FILL = Color.NAVAJOWHITE;
    private static final Color SQUARE_OUTLINE = Color.BROWN;

    private Pane base = new Pane();

    @Override
    public void start(Stage primaryStage) throws Exception {


        //
        // A: Create a rectangle that will be the background of the Pane base
        //
        Rectangle rectangle = new Rectangle();

        //
        // B: bind and set the properties of the background rectangle so that it
        //      will completely cover the base pane
        //  Use the variables defined above for the color of the background
        //
        rectangle.setFill(BACK_COLOR);
        rectangle.widthProperty().bind(primaryStage.widthProperty());
        rectangle.heightProperty().bind(primaryStage.heightProperty());
        base.getChildren().addAll(rectangle);

        //
        // C: add a handler that will create a small square each time the
        //      mouse is clicked (no matter which mouse button)
        //  Use the variables defined above for the size and color of the squares that
        //      get added
        //
        primaryStage.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            base.getChildren().add(generateSquareForMouseEvent(event));
        });


        Scene sc = new Scene(base, 500, 500);

        primaryStage.setScene(sc);
        primaryStage.setTitle("Square Adder");
        primaryStage.show();
    }

    private static Rectangle generateSquareForMouseEvent(MouseEvent event) {
        Rectangle temp = new Rectangle();

        temp.setHeight(SQUARE_SIDE);
        temp.setWidth(SQUARE_SIDE);
        temp.setFill(SQUARE_FILL);
        temp.setStroke(SQUARE_OUTLINE);
        temp.setX(event.getX());
        temp.setY(event.getY());

        return temp;
    }

}