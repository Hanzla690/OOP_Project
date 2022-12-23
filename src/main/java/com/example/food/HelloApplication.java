package com.example.food;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.setTitle("Java Eats");
        stage.setScene(new Scene(root));
        stage.resizableProperty().set(false);
        stage.getIcons().add(new Image("C:\\Users\\Ali\\IdeaProjects\\Food\\src\\main\\resources\\com\\example\\food\\logo.jpg"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}