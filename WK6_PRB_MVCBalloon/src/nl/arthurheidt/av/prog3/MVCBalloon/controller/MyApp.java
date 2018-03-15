package nl.arthurheidt.av.prog3.MVCBalloon.controller;

import nl.arthurheidt.av.prog3.MVCBalloon.model.Balloon;
import nl.arthurheidt.av.prog3.MVCBalloon.view.MyFrame;

public class MyApp {
    //Model
    private Balloon balloon;
    //View
    private MyFrame frame;
    
    public MyApp() {
	balloon = new Balloon();
	frame = new MyFrame(this, balloon);
	frame.packAndShow();
    }

    public void pumpBalloon() {
	try {
	    balloon.pump();
	} catch (BalloonExplodedException e) {
	    frame.setExploded();
	}
	frame.repaint();
	
	
    }
}
