package nl.arthurheidt.av.prog3.flatparty;

public class Apartment {
    private int floor;
    
    public Apartment(int floor) {
	this.setFloor(floor);
    }
    
    public int getFloor() {
	return floor;
    }
    private void setFloor(int floor) {
	this.floor = floor;
    }
    
    public void print() {
	System.out.println("|_" + floor + "_|");
    }

}
