package nl.arthurheidt.av.prog3.raceTrack;

public class Kart {
    private int number;
    private int speed;
    private String color;
    private int maxPetrol;
    private int petrolLeft;

    public Kart(int number, int speed, String color, int maxPetrol) {
	this.number = number;
	this.speed = speed;
	this.color = color;
	this.maxPetrol = maxPetrol;
	this.petrolLeft = maxPetrol;
    }
    public Kart(int number) {
	this.number = number;
	this.speed = 80;
	this.color = "Grey";
	this.maxPetrol = 50;
	this.petrolLeft = maxPetrol;
    }
    
    public int getNumber() {
	return number;
    }
    
    public int getSpeed() {
	return speed;
    }
    
    public String getColor() {
	return color;
    }
    
    public int maxPetrol() {
	return maxPetrol;
    }
    
    public int petrolLeft() {
	return petrolLeft;
    }
    
    public void startMotor() {
	System.out.println("Number " + number + "'s default engine starts");
    }
    
    public void turnLeft() {
	System.out.println("Number " + number + " takes a turn to the left.");
    }
    
    public void turnRight() {
	System.out.println("Number " + number + " takes a turn to the right.");
    }
    
    public void turn() {
	System.out.println("Number " + number + " takes a turn.");
    }
    
    public void finish() {
	System.out.println("Number " + number  + " finishes!");
    }
    
}
