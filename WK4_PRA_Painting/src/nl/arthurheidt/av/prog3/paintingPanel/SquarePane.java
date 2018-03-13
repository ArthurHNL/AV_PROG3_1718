package nl.arthurheidt.av.prog3.paintingPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SquarePane extends JPanel {
	private static final long serialVersionUID = 1083004638981403275L;

	public SquarePane() {
		super();
		this.setPreferredSize(new Dimension(300, 300));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.BLACK);
		g.fillRect(50, 50, 200, 200);
		
	}
	
	
}
