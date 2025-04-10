package application.praktikumguimouseevent;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//TODO Aufgabe 4: CLEAR-Button

public class MouseMalen2 extends Application {

    /**
     * Attribute
     */
    private Point2D aktuellerPunkt;
    private Point2D vorherigerPunkt;
    // Legen Sie den Anfangswert fest. In diesem Fall ist die Farbe Schwarz
    private Color zeichenFarbe = Color.BLACK;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mouse Malen2");
        primaryStage.setResizable(false);

        VBox root = new VBox();

        Canvas canvas = new Canvas(300, 250);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMousePressed(e -> setAktuellerPunkt(e));
        canvas.setOnMouseDragged(e -> {
            neuerAktuellerPunkt(e);
            paintLinie(gc);
        });
        // ColorPicker
        ColorPicker picker = new ColorPicker();
        picker.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        picker.setOnAction( e -> zeichenFarbe = picker.getValue());

        // ClearButton
        Button btn = new Button("Clear");
        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btn.setOnAction(e -> clearCanvas(gc, canvas.getWidth(), canvas.getHeight()));

        // Footer
        root.getChildren().addAll(canvas, picker, btn);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public void setAktuellerPunkt(MouseEvent e) {
        aktuellerPunkt = new Point2D(e.getX(), e.getY());
    }

    public void neuerAktuellerPunkt(MouseEvent e) {
        vorherigerPunkt = aktuellerPunkt;
        aktuellerPunkt = new Point2D(e.getX(), e.getY());
    }

    public void paintLinie(GraphicsContext gc) {
        gc.setStroke(zeichenFarbe);
        gc.setLineWidth(5);
        gc.strokeLine(vorherigerPunkt.getX(), vorherigerPunkt.getY(),
                aktuellerPunkt.getX(), aktuellerPunkt.getY());
    }

    public void clearCanvas(GraphicsContext gc, double width, double height) {
        gc.clearRect(0, 0, width, height);
    }

}
