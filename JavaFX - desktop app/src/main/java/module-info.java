module com.example.javafxdesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdesktop to javafx.fxml;
    exports com.example.javafxdesktop;
}