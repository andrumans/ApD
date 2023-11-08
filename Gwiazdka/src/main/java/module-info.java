module com.example.gwiazdka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gwiazdka to javafx.fxml;
    exports com.example.gwiazdka;
}