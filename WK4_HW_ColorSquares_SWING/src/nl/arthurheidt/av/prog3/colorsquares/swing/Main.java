package nl.arthurheidt.av.prog3.colorsquares.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public final static int CONSOLECHARS = 40;
	private static int numPrints = 0;
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("HW WK4");
		//myFrame.setPreferredSize(new Dimension(300, 300));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel myContent = new JPanel();
		myContent.setPreferredSize(new Dimension(300, 300));
		GridLayout myLayout = new GridLayout(2, 2);
		myContent.setLayout(myLayout);
		myFrame.setContentPane(myContent);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GREEN);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.YELLOW);
		
		myContent.add(panel1);
		myContent.add(panel2);
		myContent.add(panel3);
		myContent.add(panel4);
	
		myFrame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				doResize();
			}

			private void doResize() {
				if (numPrints == CONSOLECHARS) {
					System.out.println(".");
					numPrints = 0;
				} else {
					System.out.print(".");
				}
				numPrints++;
				
			}
		});
		
		myFrame.pack();
		myFrame.setVisible(true);

	}

}
