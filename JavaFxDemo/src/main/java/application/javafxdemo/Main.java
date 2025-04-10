package application.javafxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// TODO: JavaFX Java GUI Tutorial - 8 - Embedding Layouts


public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Just a Titel");

        /* Die Methode „setOnCloseRequest“ ruft die Schließmethode „closeProgram()“ auf, wenn man versucht,
        die Applikation zu schließen. */
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close Program");
        button.setOnAction(e -> closeProgram());

        /* button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Titel of Window", "Are you sure you want to send naked pics?");
            System.out.println(result);
        }); */ // for Confirm Box

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Titel", "Sure you want to exit?");
        if (answer)
            window.close();
    }

}
