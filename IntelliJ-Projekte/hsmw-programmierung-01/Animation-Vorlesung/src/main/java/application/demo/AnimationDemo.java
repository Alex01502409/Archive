package application.demo;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();

        Rectangle quadrat = new Rectangle(10, 10, 30, 30);


        // Timeline Animation

        KeyValue kv1x = new KeyValue(quadrat.translateXProperty(), 100);
        // KeyValue → welche Eigenschaft soll sich wie ändern
        KeyValue kv1y = new KeyValue(quadrat.translateYProperty(), 100);
        KeyValue kv1r = new KeyValue(quadrat.rotateProperty(), 720);

        KeyFrame kf1 = new KeyFrame(Duration.seconds(2), kv1x, kv1y, kv1r);

        KeyValue kv2x = new KeyValue(quadrat.translateXProperty(), 300);
        KeyValue kv2c = new KeyValue(quadrat.fillProperty(), Color.FUCHSIA);

        KeyFrame kf2 = new KeyFrame(Duration.seconds(3), kv2x, kv2c);

        Timeline zeitlinie = new Timeline();

        zeitlinie.getKeyFrames().addAll(kf1, kf2);

        zeitlinie.setCycleCount(-1); // -1 → unendlich
        zeitlinie.setAutoReverse(true);
        zeitlinie.play();
        root.getChildren().add(quadrat);

        Circle kreis = new Circle(200, 200, 30); // (x, y, Radius)

        Path weg = new Path();
        weg.getElements().add(new MoveTo(100,150));
        weg.getElements().add(new CubicCurveTo(100, 200, 250, 200, 200, 100));
        // (Anker1 X, Anker1 Y, Anker2 X, Anker2 Y, Ziel X, Ziel Y)

        PathTransition wegAnimation = new PathTransition();
        wegAnimation.setDuration(Duration.seconds(5));
        wegAnimation.setPath(weg);
        wegAnimation.setNode(kreis);
        wegAnimation.setCycleCount(10);
        wegAnimation.setAutoReverse(false);
        wegAnimation.play();
        root.getChildren().add(kreis);


        Scene s = new Scene(root, 500,500);
        primaryStage.setScene(s);
        primaryStage.show();
    }
}
