package nl.arthurheidt.av.prog3.airportv2;

public abstract class Airplane implements Trackable {
    // NO error cause it is valid code.
    // A constructor in an abstact class can be useful to call from a constructor
    // from an inheriting non-abstract class to set private instance variables.

    private int xPos;
    private int yPos;
    private int zPos;

    public Airplane(int xPos, int yPos, int altitude) {
	this.xPos = xPos;
	this.yPos = yPos;
	this.zPos = altitude;
    }

    public void showInfoOnRadar() {
	System.out.println(
		"[RADAR] X: " + xPos + " Y: " + yPos + " ALT: " + zPos + " " + this.getClass().getSimpleName());
    }

    // NO error cause it is valid code.
    // A method in an abstrac class can be userfull because it is inherited by
    // subclasses.
    public void takeOff() {
	System.out.println("Woooosh!");
    }
}
