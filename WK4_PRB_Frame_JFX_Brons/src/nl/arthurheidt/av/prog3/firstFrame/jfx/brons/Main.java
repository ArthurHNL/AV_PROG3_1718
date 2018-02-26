package nl.arthurheidt.av.prog3.firstFrame.jfx.brons;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("PR4a Brons");
        StackPane sp = new StackPane();
        Scene s = new Scene(sp, 300, 300, Color.RED);
        primaryStage.setScene(s);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }


}