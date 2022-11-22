import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DMoreInteraction extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane rootPane = new StackPane();
        Scene scene = new Scene(rootPane, 300, 250);

        scene.addEventHandler(MouseEvent.MOUSE_MOVED, mouseEvent -> {
            System.out.println("Moved mouse at " + mouseEvent.getSceneX() + " " + mouseEvent.getSceneY());
        });

        scene.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            System.out.println("Pressed key: " + keyEvent.getText());
        });

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }


}
