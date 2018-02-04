package nl.arthurheidt.av.raceTrack;

public class fastKart extends Kart {
    public fastKart(int number, String color) {
	super(number, 160, color, 25);
    }

    @Override
    public void startMotor() {
	System.out.println("Number " + this.getNumber() + "'s fast engine starts: hing.. HIINGG!!");
    }

    @Override
    public void turnLeft() {
	System.out.println("Number " + this.getNumber() + " takes a very fast turn to the left.");
    }

    @Override
    public void turnRight() {
	System.out.println("Number " + this.getNumber() + " takes a very fast turn to the right.");
    }

    @Override
    public void turn() {
	System.out.println("Number " + this.getNumber() + " takes a sharp turn! IIIEEEEE!");
    }

    @Override
    public void finish() {
	System.out.println("The " + this.getColor() + " Number " + this.getNumber() + " finishes quickly!");
    }
}
