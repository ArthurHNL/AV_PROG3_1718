package nl.arthurheidt.pr4b.brons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage window) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDoc.fxml"));
		Scene s = new Scene(root);
		window.setScene(s);
		window.setTitle("PR4B Brons");
		window.setResizable(false);
		window.show();
	}

}
