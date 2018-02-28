package nl.arthurheidt.pr4b.zilver;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class FXMLControl implements Initializable{
	
	public final static String[] QUOTES = {
			"GET TO THE CHOPPER!",
			"The names Bond, James Bond",
			"Hasta la vista baby",
			"You were merely adopted by the darnkess, I was born in it, molded by it.",
			"Shut up! Yes or no - you wanna die?",
			"Yippee ki yay, motherfucker",
			"I'll be back...",
			"Hello World!"
	};
	
	private Random rnd;	
	
	@FXML
	private StackPane sp;
	@FXML
	private Button b;
	
	@FXML
	public void buttonClick(ActionEvent e) {
		b.setText(QUOTES[rnd.nextInt(QUOTES.length)]);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		rnd = new Random();
	}

	
	
}
