package application.javafxdemo;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {

    static boolean ansver;


    public static boolean display(String titel, String message) {
        Stage window = new Stage();

        // Blockiert die Verwendung anderer Fenster, während das neue Fenster geöffnet ist
        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle(titel);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        /* Create two buttons */
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            ansver = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            ansver = false;
            window.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        /* Scene scene = new Scene(layout); */
        window.setScene(new Scene(layout, 250, 200));
        window.showAndWait();

        return ansver;
    }

}



















