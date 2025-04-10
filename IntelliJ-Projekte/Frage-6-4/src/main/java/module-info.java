module application.frage64 {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.frage64 to javafx.fxml;
    exports application.frage64;
}