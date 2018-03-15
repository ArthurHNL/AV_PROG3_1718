package nl.arthurheidt.av.prog3.MVCBalloon.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ExceptionPane extends JPanel {
    private static final long serialVersionUID = -3009569816533534691L;
    
    public ExceptionPane() {
	this.setSize(new Dimension(600, 600));
	this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.setFont(new Font("Arial", Font.PLAIN, 20));
	g.drawString("BANG", 50, 50);
    }
}
