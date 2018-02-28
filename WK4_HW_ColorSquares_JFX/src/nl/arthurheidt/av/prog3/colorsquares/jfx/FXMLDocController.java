package nl.arthurheidt.av.prog3.colorsquares.jfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

public class FXMLDocController implements Initializable {
	
	public final static int LINELENGTH = 40;
	private int numPrinted = 0;
	
	@FXML
	private GridPane rootElement;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Hello World!");
		rootElement.widthProperty().addListener(e -> {
			resized();
		});
		rootElement.heightProperty().addListener(e -> {
			resized();
		});
	}
	
	private void resized() {
		if (numPrinted == (LINELENGTH - 1)) {
			numPrinted = 0;
			System.out.println(".");
		}else {
			System.out.print(".");
		}
		numPrinted++;
	}
	
}
