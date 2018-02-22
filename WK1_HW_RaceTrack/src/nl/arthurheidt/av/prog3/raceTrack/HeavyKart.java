package nl.arthurheidt.av.prog3.raceTrack;

public class HeavyKart extends Kart {
    public HeavyKart(int number, String color) {
	super(number, 40, color, 100);
    }

    @Override
    public void startMotor() {
	System.out.println("Number " + this.getNumber() + "'s mighty engine roars: GGRROOOAAARR!!");
    }

    @Override
    public void turnLeft() {
	System.out.println("Number " + this.getNumber() + " takes a solid turn to the left.");
    }

    @Override
    public void turnRight() {
	System.out.println("Number " + this.getNumber() + " takes a solid turn to the right.");
    }

    @Override
    public void turn() {
	System.out.println("Number " + this.getNumber() + " destroys that turn: VVRROOOMM!");
    }

    @Override
    public void finish() {
	System.out.println("The " + this.getColor() + " Number " + this.getNumber() + " finishes finally!");
    }
}
