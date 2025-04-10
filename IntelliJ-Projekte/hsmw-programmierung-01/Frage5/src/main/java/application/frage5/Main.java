package application.frage5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Frage 5");

        Slider slider = new Slider(0, 10, 0);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(1);
        slider.setMinorTickCount(0);
        slider.setSnapToTicks(true);

        TextField textField = new TextField();

        Label label = new Label();

        slider.valueProperty().addListener((_, _, newValue) -> {
            String text = textField.getText(); // Wert aus TextField lesen
            int sliderValue = newValue.intValue(); // Schieberegler-Wert

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sliderValue; i++) {
                output.append(text).append("\n");
            }
            label.setText(output.toString());
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(slider, textField, label);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}