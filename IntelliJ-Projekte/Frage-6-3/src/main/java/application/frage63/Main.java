package application.frage63;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // TextFields für die Eingabe
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        textField1.setPromptText("Erste Zahl");
        textField2.setPromptText("Zweite Zahl");

        // Label für das Ergebnis
        Label resultLabel = new Label("Ergebnis wird hier angezeigt.");

        // Button zur Berechnung
        Button calculateButton = new Button("Addieren");

        // Ereignisverarbeitung beim Buttonklick
        calculateButton.setOnAction(e -> {
            try {
                // Eingaben einlesen und zu Ganzzahlen parsen
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());

                // Berechnung und Anzeige des Ergebnisses
                int sum = num1 + num2;
                resultLabel.setText("Ergebnis: " + sum);
            } catch (NumberFormatException ex) {
                // Fehlerbehandlung für ungültige Eingaben
                resultLabel.setText("Fehler: Bitte nur Ganzzahlen eingeben.");
            }
        });

        // Layout für die Benutzeroberfläche
        VBox root = new VBox(10);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        root.getChildren().addAll(resultLabel, textField1, textField2, calculateButton);


        // Szene erstellen und anzeigen
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Addition von Ganzzahlen");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
