package nl.arthurheidt.av.prog3.MVCBalloon.view;

import javax.swing.JPanel;

import nl.arthurheidt.av.prog3.MVCBalloon.controller.MyApp;
import nl.arthurheidt.av.prog3.MVCBalloon.model.Balloon;

public class MyContentPane extends JPanel {
    private static final long serialVersionUID = -4495767734328513203L;
    private ButtonPanel buttons;
    private BalloonPanel balloon;
    public MyContentPane(MyApp m, Balloon b){
	super();
	buttons = new ButtonPanel(m);
	balloon = new BalloonPanel(b);
	this.add(balloon);
	this.add(buttons);
    }
}
