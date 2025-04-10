module application.frage51 {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.frage51 to javafx.fxml;
    exports application.frage51;
}