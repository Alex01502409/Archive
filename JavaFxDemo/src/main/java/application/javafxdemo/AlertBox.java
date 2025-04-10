package application.javafxdemo;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

    public static void display(String titel, String message) {
            Stage window = new Stage();

            window.initModality(Modality.APPLICATION_MODAL); // Blockiert die Verwendung anderer Fenster, während das neue Fenster geöffnet ist
            window.setTitle(titel);
            window.setMinWidth(250);

            Label label = new Label();
            label.setText(message);

            Button closeButton = new Button("Close the window");
            closeButton.setOnAction(e -> window.close());

            VBox layout = new VBox(10);
            layout.getChildren().addAll(label, closeButton);
            layout.setAlignment(Pos.CENTER);

//            Scene scene = new Scene(layout);
            window.setScene(new Scene(layout, 250, 200));
            window.showAndWait();
    }

}



















