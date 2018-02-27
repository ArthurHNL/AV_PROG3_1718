package nl.arthurheidt.pr4b.zilver;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage window = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDoc.fxml"));
		Scene s = new Scene(root);
		
		window.setTitle("PR4B Zilver");
		window.setScene(s);
		window.setResizable(false);
		window.centerOnScreen();
		window.show();
		
		
	}
}
