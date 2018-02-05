package nl.arthurheidt.av.prog3.airport;

import java.util.ArrayList;

public class Airport {
    ArrayList<Airplane> planes;

    public Airport() {
	planes = new ArrayList<Airplane>();
    }

    public void addPlane(Airplane p) {
	planes.add(p);
    }

    public Airplane getPlane(int index) {
	try {
	    return planes.get(index);
	} catch (Exception e) {
	    return null;
	}
    }

    public void showAllContents() {
	for (Airplane p : planes)
	    showContents(p);
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
	System.out.println("Unknown plane type detected!");
    }

}
