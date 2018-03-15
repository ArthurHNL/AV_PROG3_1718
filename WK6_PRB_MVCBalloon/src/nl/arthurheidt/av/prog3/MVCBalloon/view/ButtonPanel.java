package nl.arthurheidt.av.prog3.MVCBalloon.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import nl.arthurheidt.av.prog3.MVCBalloon.controller.MyApp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class ButtonPanel extends JPanel {
    private static final long serialVersionUID = -4588884254205067493L;
    private JButton button;
    private BoxLayout layout;
    private MyApp controller;
    
    public ButtonPanel(MyApp m) {
	super();
	controller = m;
	button = new JButton("Pump");
	button.setAlignmentX(Component.CENTER_ALIGNMENT);
	layout = new BoxLayout(this, BoxLayout.X_AXIS);
	this.setPreferredSize(new Dimension(600, 50));
	this.setLayout(layout);
	this.setBackground(Color.LIGHT_GRAY);
	this.add(button);
	button.addActionListener(e -> {
	    controller.pumpBalloon();
	});
    }
    
}
