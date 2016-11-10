import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Scanner;


public class ExtraCredit1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rect 1 Center: ");
        Integer r1x = scanner.nextInt();
        Integer r1y = scanner.nextInt();

        System.out.print("Rect 1 Width/height: ");
        Integer r1w = scanner.nextInt();
        Integer r1h = scanner.nextInt();

        System.out.print("Rect 2 Center: ");
        Integer r2x = scanner.nextInt();
        Integer r2y = scanner.nextInt();

        System.out.print("Rect 2 Width/height: ");
        Integer r2w = scanner.nextInt();
        Integer r2h = scanner.nextInt();

        Group group = new Group();
        Rectangle r1 = new Rectangle(r1x - (r1w / 2), r1y - (r1h / 2), r1w, r1h);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.BLUE);

        Rectangle r2 = new Rectangle(r2x - (r2w / 2), r2y - (r2h / 2), r2w, r2h);
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.BLUE);

        group.getChildren().addAll(r1, r2);
        Scene scene = new Scene(new BorderPane(group), 250, 150);
        primaryStage.setTitle("Rectangles"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    public static void main(String[] args) {
        launch(args);
    }

}
