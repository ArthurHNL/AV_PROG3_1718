package nl.arthurheidt.av.prog3.textEditor;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
    private static final long serialVersionUID = -1853342568032453858L;
    private BoxLayout layout;
    private JButton changeFontButton;
    private ActionListener controller;
    
    public ButtonPanel(ActionListener controller) {
	super();
	this.controller = controller;
	
	layout = new BoxLayout(this, BoxLayout.Y_AXIS);
	this.setLayout(layout);
	
	changeFontButton = new JButton("Toggle Font");
	changeFontButton.addActionListener(this.controller);
	this.add(changeFontButton);
	
    }
    

}
