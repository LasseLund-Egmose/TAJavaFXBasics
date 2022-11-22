import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EDrawing extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane rootPane = new StackPane();
        Scene scene = new Scene(rootPane, 300, 250);

        Canvas canvas = new Canvas(300, 100);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(2.0);
        gc.setFill(Color.RED);
        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);
        gc.fillOval(70, 10, 50, 20);
        gc.strokeText("Hello Canvas", 150, 20);
        rootPane.getChildren().add(canvas);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }


}
