package nl.arthurheidt.av.prog3.paintButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintDemoPane extends JPanel {

	private static final long serialVersionUID = 6137579141545786275L;

	private boolean buttonPressed = false;
	private JButton myButton;
	private Dimension dim;

	public PaintDemoPane() {
		//Call the superconstructor to create the actual panel
		super();
		//Define dimension
		dim = new Dimension(400, 300);
		
		//Disable layoutmanager and set dimension
		this.setLayout(null);
		this.setPreferredSize(dim);

		//Create and position button
		myButton = new JButton("Done!");
		myButton.setBounds(300, 0, 100, 300);
		this.add(myButton);
		
		//Set what happens when the button is clicked
		myButton.addActionListener(e -> handleButtonPress());
	}

	private void handleButtonPress() {
		buttonPressed = true;
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		if (buttonPressed) {
			g.setColor(Color.YELLOW);
		}
		g.fillRect(0, 0, dim.width, dim.height);
	}

}
