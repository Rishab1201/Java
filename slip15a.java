import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class slip15a extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Circle face = new Circle(150, 150, 100);
        face.setFill(Color.YELLOW);

        Circle leftEye = new Circle(110, 120, 15);
        Circle rightEye = new Circle(190, 120, 15);
        leftEye.setFill(Color.BLACK);
        rightEye.setFill(Color.BLACK);

        Arc smile = new Arc(150, 170, 40, 30, 0, -180);
        smile.setFill(null);
        smile.setStroke(Color.BLACK);

        root.getChildren().addAll(face, leftEye, rightEye, smile);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Smiley Face");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
