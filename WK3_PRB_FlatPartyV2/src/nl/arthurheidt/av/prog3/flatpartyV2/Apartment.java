package nl.arthurheidt.av.prog3.flatpartyV2;

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
    public String getPrintLine(){
	return "|_" + floor + "_|";
    }

}
