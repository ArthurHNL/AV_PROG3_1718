package nl.arthurheidt.pr4a.zilver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDoc.fxml"));
		Scene s = new Scene(root);
		
		window.setTitle("PR4A Zilver");
		window.setScene(s);
		window.setResizable(false);
		window.centerOnScreen();
		window.show();
		
	}

}
