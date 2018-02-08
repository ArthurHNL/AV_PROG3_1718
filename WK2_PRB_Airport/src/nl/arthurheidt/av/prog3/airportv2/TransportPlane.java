package nl.arthurheidt.av.prog3.airportv2;

public class TransportPlane extends Airplane implements Trackable {
    private int passengers;

    private int xPos;
    private int yPos;
    private int zPos;

    public TransportPlane(int xPos, int yPos, int altitude) {
	super();
	this.xPos = xPos;
	this.yPos = yPos;
	this.zPos = altitude;
	passengers = 0;
    }

    public void sentAllPassengersHome() {
	passengers = 0;
    }

    public void showInfoOnRadar() {
	System.out.println(
		"[RADAR] X: " + xPos + " Y: " + yPos + " ALT: " + zPos + " " + this.getClass().getSimpleName());
    }

    public int getPassengers() {
	return passengers;
    }

    public void board(int amount) {
	passengers += amount;
    }

    public void showPassengerAmount() {
	System.out.println(passengers);
    }

}
