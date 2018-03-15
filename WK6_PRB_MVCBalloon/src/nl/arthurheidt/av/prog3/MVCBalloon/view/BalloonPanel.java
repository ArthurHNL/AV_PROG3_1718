package nl.arthurheidt.av.prog3.MVCBalloon.view;

import nl.arthurheidt.av.prog3.MVCBalloon.model.Balloon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class BalloonPanel extends JPanel {
    private static final long serialVersionUID = -7479363673676081116L;
    private Balloon balloon;
    
    public BalloonPanel(Balloon b) {
	super();
	this.setBackground(Color.BLUE);
	this.balloon = b;
	this.setPreferredSize(new Dimension(600, 550));
    }
    
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	drawBalloon(g);
    }
    
    private void drawBalloon(Graphics g) {
	g.setColor(Color.YELLOW);
	int size = 40 * balloon.getSize();
	int x = (int) (300 - 0.5 * size) ;
	int y = (int) (300 - 0.5 * size) ;
	g.fillOval(x, y, size, size);
	
	g.setColor(Color.BLACK);
	String s = Integer.toString(balloon.getSize());
	g.drawString(s, 300, 300);
    }
}
