module com.example.javafxsus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsus to javafx.fxml;
    exports com.example.javafxsus;
}