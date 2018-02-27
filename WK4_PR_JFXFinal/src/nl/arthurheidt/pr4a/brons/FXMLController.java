package nl.arthurheidt.pr4a.brons;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import java.net.URL;
import javafx.scene.layout.VBox;
import java.util.ResourceBundle;

public class FXMLController implements Initializable{
	
	@FXML
	private VBox vbox;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("FXML Rules!");
	}
}
