package nl.arthurheidt.av.prog3.airportv2;

import java.util.ArrayList;

public class Airport {
    ArrayList<Airplane> planes;
    Radar rad;

    public Airport() {
	planes = new ArrayList<Airplane>();
	rad = new Radar();
    }

    public void addPlane(Airplane p) {
	if (p == null) {
	    throw new IllegalArgumentException("No null planes!");
	}
	if (p instanceof Trackable) {
	    //Need to cast
	    rad.addTrackable((Trackable) (p));
	}
	planes.add(p);
    }

    public void addPlanes(Airplane... p) {
	for (Airplane ap : p) {
	    if (ap != null) {
		this.addPlane(ap);
	    }
	}
    }

    public Airplane getPlane(int index) {
	try {
	    return planes.get(index);
	} catch (Exception e) {
	    return null;
	}
    }

    public void showAllContents() {
	rad.showTrackables();
	for (Airplane p : planes) {
	    showContents(p);
	}
    }

    private void showContents(Airplane p) {
	if (p == null) {
	    System.out.println("Empty hangar detected.");
	    return;
	}
	if (p instanceof CargoPlane) {
	    CargoPlane cp = (CargoPlane) p;
	    cp.showCargo();
	    return;
	}
	if (p instanceof TransportPlane) {
	    TransportPlane tp = (TransportPlane) p;
	    tp.showPassengerAmount();
	    return;
	}
	if (p instanceof StealthPlane) {
	    System.out.println("Classified millitary apparatus.");
	    return;
	}
	System.out.println("Unknown plane type detected!");
    }

}
