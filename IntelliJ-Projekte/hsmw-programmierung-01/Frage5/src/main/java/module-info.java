module application.frage5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.frage5 to javafx.fxml;
    exports application.frage5;
}