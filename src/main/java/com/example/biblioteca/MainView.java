package com.example.biblioteca;

import com.example.biblioteca.DataBaseConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //conectarea la baza de date
        try {
            if(DataBaseConnection.getConnection() != null) {
                System.out.println("Conectare reușită la baza de date!");
            }
        } catch(Exception e) {
            System.out.println("Eroare la conectarea la baza de date!");
            e.printStackTrace();
        }

        FXMLLoader fxmlLoader = new FXMLLoader(MainView.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 840, 600);
        stage.setTitle("Biblioteca");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}