package nl.arthurheidt.pr4a.zilver;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class FXMLControl implements Initializable{

	@FXML
	private VBox vbox;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Dimension dScreen = Toolkit.getDefaultToolkit().getScreenSize();
		vbox.setPrefSize((dScreen.getWidth() * .25), (dScreen.getHeight() * .25));
	}
	
	

}
