package com.example.javafxsus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Registration extends Application {
    @Override
    public void start(Stage stage) {
        //creating label email
        Text text1 = new Text("Email");

        //creating label password
        Text text2 = new Text("Password");

        //Creating Text Filed for email
        TextField textField1 = new TextField();

        //Creating Text Filed for password
        PasswordField textField2 = new PasswordField();

        //Creating Buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);

        //Styling nodes
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("CSS Example");

        //Adding scene to the stage
        stage.setScene(scene);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (empty(textField1.getText(), textField2.getText(), scene)) {
                    checkemail(textField1.getText(), scene);
                    checkpassw(textField2.getText(), scene);
                }
            }
        });


        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textField1.clear();
                textField2.clear();
            }
        });

        //Displaying the contents of the stage
        stage.show();
    }

    public void checkemail(String email, Scene scene){
        if(email.contains("@") && email.contains(".")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Approved");
            alert.setHeaderText(null);
            alert.setContentText("Correct email");
            alert.initOwner(scene.getWindow());
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Uwaga");
            alert.setHeaderText(null);
            alert.setContentText("Niepoprawny mail");
            alert.initOwner(scene.getWindow());
            alert.show();
        }
    }

    public boolean empty(String emailemty, String passwemty, Scene scene) {
        if (emailemty.length() == 0 || passwemty.length() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Uwaga");
            alert.setHeaderText(null);
            alert.setContentText("Proszę wypełnić pola");
            alert.initOwner(scene.getWindow());
            alert.show();
            return false;
        } else {
            return true;
        }
    }
    public void checkpassw(String pasw, Scene scene){
        if(pasw.length() < 8){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Uwaga");
            alert.setHeaderText(null);
            alert.setContentText("Hasło musi zawierać przynajmniej 8 znaków");
            alert.initOwner(scene.getWindow());
            alert.show();
        }
        else {
            return;
        }
    }
    public static void main(String args[]){
        launch(args);
    }
}