module application.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.javafxdemo to javafx.fxml;
    exports application.javafxdemo;
}