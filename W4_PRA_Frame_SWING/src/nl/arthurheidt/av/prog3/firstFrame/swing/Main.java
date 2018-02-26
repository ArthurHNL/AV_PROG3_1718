package nl.arthurheidt.av.prog3.firstFrame.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
	JFrame myFrame = new JFrame("Prog 3 week 4");
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel myPanel = new JPanel();
	myPanel.setBackground(Color.ORANGE);

	Container content = myFrame.getContentPane();
	content.add(myPanel);

	myFrame.pack();
	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	size.setSize((size.getWidth() * 0.25), (size.getHeight() * 0.25));
	myFrame.setSize(size);

	center(myFrame);
	myFrame.setResizable(false);
	myFrame.setVisible(true);
    }

    private static void center(JFrame f) {
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	Point centerPoint = ge.getCenterPoint();
	
	int x = (int) (centerPoint.getX() - f.getWidth() / 2);
	int y = (int) (centerPoint.getY() - f.getHeight() / 2);
	f.setLocation(x, y);
    }

}
