package nl.arthurheidt.av.prog3.paintButton;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGUI extends JFrame {
	private static final long serialVersionUID = 321382078826256312L;
	
	public MyGUI(String title) {
		super(title);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public MyGUI(String title, JPanel contentPane) {
		this(title);
		this.setContentPane(contentPane);
	}
	public void packAndShow() {
		this.pack();
		this.setVisible(true);
	}
	
	

}
