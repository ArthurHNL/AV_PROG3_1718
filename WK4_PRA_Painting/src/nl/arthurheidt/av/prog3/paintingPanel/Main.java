package nl.arthurheidt.av.prog3.paintingPanel;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("PROG3 Week4b simpel - anders");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SquarePane myPane = new SquarePane();
		myFrame.setContentPane(myPane);
		myFrame.pack();
		myFrame.setVisible(true);
		
		

	}

}
