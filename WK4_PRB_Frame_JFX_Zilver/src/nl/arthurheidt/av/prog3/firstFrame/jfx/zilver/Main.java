package nl.arthurheidt.av.prog3.firstFrame.jfx.zilver;

import javafx.scene.paint.Color;

import java.awt.Dimension;
import java.awt.Toolkit;

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
        primaryStage.setTitle("PR4a zilver");
        StackPane sp = new StackPane();
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Scene s = new Scene(sp, (size.getWidth() * 0.25), (size.getHeight() * 0.25), Color.GREEN);
        primaryStage.setScene(s);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }


}