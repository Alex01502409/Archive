package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("MainWindow.fxml"));
            AnchorPane root  = loader.load();
//            AnchorPane root = new AnchorPane ();
            Scene scene = new Scene(root, 400,400) ;
            primaryStage.setMinHeight(400); primaryStage.setMinWidth(500);
            primaryStage.setTitle("Ein einfaches Beispiel");
            primaryStage.setScene (scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
