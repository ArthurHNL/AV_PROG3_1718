package nl.arthurheidt.av.prog3.airportv2;

import java.util.ArrayList;

public class Radar {
    private ArrayList<Trackable> trackables;

    public Radar() {
	this.trackables = new ArrayList<Trackable>();
    }

    public void addTrackable(Trackable t) {
	trackables.add(t);
    }

    public void showTrackables() {
	for (Trackable t : trackables) {
	    if (t != null) {
		t.showInfoOnRadar();
	    }
	}
    }
}
