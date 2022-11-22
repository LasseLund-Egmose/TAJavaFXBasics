import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AFirstGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane rootPane = new StackPane();

        Scene scene = new Scene(rootPane, 300, 250);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }


}
