module EinEinfachesBeispiel {

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    opens application to javafx.graphics, javafx.fxml;
}
