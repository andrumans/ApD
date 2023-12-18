package com.example.javafxdesktop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ItemListApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lista z checkboxami");

        ObservableList<String> items = FXCollections.observableArrayList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4"
        );

        ListView<String> listView = new ListView<>(items);

        HBox hbox = new HBox();
        hbox.getChildren().add(listView);

        for (String item : items) {
            CheckBox checkBox = new CheckBox(item);
            HBox checkBoxContainer = new HBox(checkBox);
            hbox.getChildren().add(checkBoxContainer);
        }

        Scene scene = new Scene(hbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
