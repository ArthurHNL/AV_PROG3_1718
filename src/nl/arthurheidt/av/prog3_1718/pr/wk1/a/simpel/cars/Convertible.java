package nl.arthurheidt.av.prog3_1718.pr.wk1.a.simpel.cars;

public class Convertible extends Car {

    private boolean roofIsOpen;
    
    public Convertible(String licensePlate, double capacity, boolean roofIsOpen) {
	super(licensePlate, capacity);
	this.roofIsOpen = roofIsOpen;
    }
    
    public boolean isRoofOpen() {
	return roofIsOpen;
    }
    
    public void toggleRoof() {
	roofIsOpen = !roofIsOpen;
    }

}
