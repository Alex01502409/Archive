package application.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();

        Text text = new Text("Hallo Stasik");

        GaussianBlur e = new GaussianBlur();
        e.setRadius(5);

        text.setEffect(e);

        root.setEffect(e);

        root.getChildren().add(text);

        Text text2 = new Text("Ho ho ho");

        DropShadow schatten = new DropShadow();
        text2.setEffect(schatten);

        root.getChildren().add(text2);

        Scene s = new Scene(root);
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
