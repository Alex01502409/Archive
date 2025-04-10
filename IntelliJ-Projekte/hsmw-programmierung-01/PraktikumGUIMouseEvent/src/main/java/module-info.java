module application.praktikumguimouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.praktikumguimouseevent to javafx.fxml;
    exports application.praktikumguimouseevent;
}