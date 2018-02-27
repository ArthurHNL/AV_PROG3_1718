package nl.arthurheidt.pr4a.brons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("pr4abrons.fxml.fxml"));
		Scene s = new Scene(root);
		stage.setTitle("PR4A Brons");
		stage.setScene(s);
		stage.setResizable(false);
		stage.show();
	}

}
