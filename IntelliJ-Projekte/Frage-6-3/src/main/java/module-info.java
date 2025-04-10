module application.frage63 {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.frage63 to javafx.fxml;
    exports application.frage63;
}