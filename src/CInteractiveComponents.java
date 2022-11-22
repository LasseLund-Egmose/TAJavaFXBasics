import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CInteractiveComponents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        StackPane rootPane = new StackPane();

        Button testBtn = new Button();
        testBtn.setText("Test button");
        testBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
            System.out.println("You clicked the button at " + mouseEvent.getSceneX() + " " + mouseEvent.getSceneY());
        });

        rootPane.getChildren().add(testBtn);

        Scene scene = new Scene(rootPane, 300, 250);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }


}
