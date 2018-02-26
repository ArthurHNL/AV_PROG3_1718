package nl.arthurheidt.av.prog3.button.swing;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	String[] buttonRoulette = { "Hello World!", "GET TO THE CHOPPER!", "The name's bond, James Bond", "RUN!",
		"I like that!" };
	Random r = new Random();

	JFrame myFrame = new JFrame("Press the button!");

	JButton myButton = new JButton("CLICK ME!");
	myButton.addActionListener(e -> {
	    myButton.setText(buttonRoulette[r.nextInt(buttonRoulette.length)]);
	});
	myFrame.getContentPane().add(myButton);

	myFrame.pack();
	myFrame.setSize(300, 300);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setVisible(true);
    }
}
