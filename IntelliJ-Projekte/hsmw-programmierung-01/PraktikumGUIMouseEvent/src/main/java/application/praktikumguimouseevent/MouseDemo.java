package application.praktikumguimouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// TODO Aufgabe 1: Anwendung zur Beobachtung des Maus-Klicks

public class MouseDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mouse Demo");
        primaryStage.setResizable(false);

        VBox root = new VBox();

        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMousePressed(e -> paint(gc, e));

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));// -> Scene scene = new Scene(root);
        primaryStage.show();
    }

    public void paint(GraphicsContext gc, MouseEvent e) {

        double x = e.getX();
        double y = e.getY();

        gc.setFill(Color.ORANGERED);
        gc.fillOval(x, y, 15, 15);

    }

}
