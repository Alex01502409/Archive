package application.praktikumguimouseevent;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//TODO Aufgabe 2: Malen mit der Maus

public class MouseMalen extends Application {

    /**
     * Attribute
     */
    private Point2D aktuellerPunkt;
    private Point2D vorherigerPunkt;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mouse Malen");
        primaryStage.setResizable(false);

        VBox root = new VBox();

        Canvas canvas = new Canvas(300, 250);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMousePressed(e -> setAktuellerPunkt(e));
        canvas.setOnMouseDragged(e -> {
            neuerAktuellerPunkt(e);
            paintLinie(gc);
        });

        root.getChildren().add(canvas);
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
        gc.setStroke(Color.MEDIUMVIOLETRED);
        gc.setLineWidth(5);
        gc.strokeLine(vorherigerPunkt.getX(), vorherigerPunkt.getY(),
                aktuellerPunkt.getX(), aktuellerPunkt.getY());
    }

}
