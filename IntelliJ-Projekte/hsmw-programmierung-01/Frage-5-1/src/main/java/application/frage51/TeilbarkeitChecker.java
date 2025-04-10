package application.frage51;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TeilbarkeitChecker extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Erstellen der UI-Elemente
        TextField zaehlerField = new TextField();
        zaehlerField.setPromptText("Zähler"); // Platzhaltertext

        TextField nennerField = new TextField();
        nennerField.setPromptText("Nenner"); // Platzhaltertext

        Button checkButton = new Button("Prüfen");

        Label resultLabel = new Label();

        // Button-Action mit Lambda
        checkButton.setOnAction(event -> {
            try {
                // Eingaben einlesen
                int zaehler = Integer.parseInt(zaehlerField.getText());
                int nenner = Integer.parseInt(nennerField.getText());

                // Prüfen, ob teilbar
                if (nenner == 0) {
                    resultLabel.setText("Nenner darf nicht 0 sein!");
                } else if (zaehler % nenner == 0) {
                    resultLabel.setText("teilbar");
                } else {
                    resultLabel.setText("nicht teilbar");
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Ungültige Eingabe!");
            }
        });

        // Anordnung der Elemente horizontal
        HBox hBox = new HBox(10); // Abstand zwischen den Elementen
        hBox.getChildren().addAll(zaehlerField, nennerField, checkButton, resultLabel);

        // Szene erstellen und anzeigen
        Scene scene = new Scene(hBox, 500, 100);
        primaryStage.setTitle("Teilbarkeit prüfen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}