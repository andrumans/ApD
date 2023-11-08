package com.example.gwiazdka;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Circle;

public class ComplexShape extends Application {
    @Override
    public void start(Stage stage) {
        // Creating a Path
        Path path = new Path();

        // Moving to the starting point
        MoveTo moveTo = new MoveTo(108, 71);

        // Creating lines
        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126, 232);
        LineTo line3 = new LineTo(232, 52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(108, 71);

        // Adding all the elements to the path
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        // Creating a Group object
        Group root = new Group();

        // Adding the path to the group
        root.getChildren().add(path);

        // Creating a circle
        Circle circle = new Circle(215, 150, 30);

        // Adding the circle to the group
        root.getChildren().add(circle);

        // Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        // Setting title to the Stage
        stage.setTitle("Drawing an arc through a path");

        // Adding scene to the stage
        stage.setScene(scene);

        // Displaying the contents of the stage
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
