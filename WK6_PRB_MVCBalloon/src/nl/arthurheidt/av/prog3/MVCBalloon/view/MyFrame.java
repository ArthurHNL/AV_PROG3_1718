package nl.arthurheidt.av.prog3.MVCBalloon.view;

import nl.arthurheidt.av.prog3.MVCBalloon.controller.MyApp;
import nl.arthurheidt.av.prog3.MVCBalloon.model.Balloon;
import javax.swing.JFrame;
import java.awt.Dimension;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = -6320948984729751844L;
    private MyContentPane myPane;
    private ExceptionPane ePane;
    
    public MyFrame(MyApp m, Balloon b) {
	super();
	this.setTitle("Balloon!");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setSize(new Dimension(600, 600));
	
	ePane = new ExceptionPane();
	myPane = new  MyContentPane(m, b);
	this.setContentPane(myPane);
	
    }
    
    public void packAndShow() {
	this.pack();
	this.setVisible(true);
    }
    
    public void setExploded() {
	this.setContentPane(ePane);
    }
}
