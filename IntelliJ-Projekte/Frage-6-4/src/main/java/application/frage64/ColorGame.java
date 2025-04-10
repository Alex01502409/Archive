package application.frage64;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class ColorGame extends Application {

    private static final int RECT_WIDTH = 50;
    private static final int RECT_HEIGHT = 40;
    private static final int NUM_RECTANGLES = 8;
    private Rectangle[] rectangles = new Rectangle[NUM_RECTANGLES];
    private int currentColoredIndex = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox rectangleBox = new HBox(5);
        for (int i = 0; i < NUM_RECTANGLES; i++) {
            rectangles[i] = new Rectangle(RECT_WIDTH, RECT_HEIGHT, Color.BLACK);
            rectangleBox.getChildren().add(rectangles[i]);
        }


        Button button1 = new Button("Farbe setzen");
        button1.setOnAction(e -> setFirstRectangleColor());

        Button button2 = new Button("Farbe wandern lassen");
        button2.setOnAction(e -> moveColorThroughRectangles());

        VBox root = new VBox(10, rectangleBox, button1, button2);
        Scene scene = new Scene(root, 450, 150);

        primaryStage.setTitle("Farbspiel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setFirstRectangleColor() {
        Random random = new Random();
        Color randomColor = Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());
        rectangles[0].setFill(randomColor);

        for (int i = 1; i < NUM_RECTANGLES; i++) {
            rectangles[i].setFill(Color.BLACK);
        }
        currentColoredIndex = 0;
    }

    private void moveColorThroughRectangles() {
        if (currentColoredIndex < NUM_RECTANGLES - 1) {
            Color currentColor = (Color) rectangles[currentColoredIndex].getFill();
            rectangles[currentColoredIndex].setFill(Color.BLACK);
            currentColoredIndex++;
            rectangles[currentColoredIndex].setFill(currentColor);
        } else {
            for (Rectangle rectangle : rectangles) {
                rectangle.setFill(Color.BLACK);
            }
            currentColoredIndex = 0;
        }
    }
}

