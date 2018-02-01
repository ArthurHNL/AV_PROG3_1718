package nl.arthurheidt.av.prog3_1718.pr.wk1.a.simpel.cars;

public abstract class Car {
    private String licensePlate;
    private double capacity;
    public Car(String licensePlate, double capacity) {
	this.licensePlate = licensePlate;
	this.capacity = capacity;
    }
    
    public String getLicensePlate() {
	return licensePlate;
    }
    public double getCapacity() {
	return capacity;
    }
    
    public void drive() {
	System.out.println("[" + licensePlate + "] Vroom Vroom!");
    }

}
