package nl.arthurheidt.av.prog3.raceTrack;

import java.util.ArrayList;

public class RaceTrack {
    ArrayList<Kart> karts;
    
    public RaceTrack() {
	karts = new ArrayList<Kart>();
    }
    
    public void addKart(Kart k) {
	karts.add(k);
    }
    

    
    
    private void allStart() {
	for (Kart k : karts) {
	    if (k != null) k.startMotor();
	}
    }
    
    private void allTurnLeft() {
	for (Kart k : karts) {
	    if (k != null) k.turnLeft();
	}
    }
    
    private void allTurnRight() {
	for (Kart k : karts) {
	    if (k != null) k.turnRight();
	}
    }
    
    private void allTurn() {
	for (Kart k : karts) {
	    if (k != null) k.turn();
	}
    }
    
    private void allFinish() {
	for (Kart k : karts) {
	    if (k != null) k.finish();
	}
    }
    
    public void race() {
	System.out.println("On your marks..");
	System.out.println("Get set...");
	allStart();
	System.out.println("GO!");
	allTurnLeft();
	allTurnRight();
	allTurn();
	allTurnLeft();
	allFinish();
    }
}
