package nl.arthurheidt.av.prog3.airportv2;

public class CargoPlane extends Airplane implements Trackable {
    private String load;
    private int xPos;
    private int yPos;
    private int zPos;

    public CargoPlane(String load, int xPos, int yPos, int altitude) {
	super();
	this.loadUp(load);
	this.xPos = xPos;
	this.yPos = yPos;
	this.zPos = altitude;
    }

    public void loadUp(String load) {
	this.load = load;
    }

    public String getCargo() {
	return load;
    }

    public void showCargo() {
	System.out.println(load);
    }

    public void showInfoOnRadar() {
	System.out.println(
		"[RADAR] X: " + xPos + " Y: " + yPos + " ALT: " + zPos + " " + this.getClass().getSimpleName());
    }

    // DOES create an arror because it does not make sense to have an abstract
    // method in a non-abstract class, cause the method could not be executed when
    // it is called on an instance of the class.
    // public abstract void unload();
}
