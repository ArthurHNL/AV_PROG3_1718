package nl.arthurheidt.av.prog3.airport;

public abstract class Airplane {
    // NO error cause it is valid code.
    // A constructor in an abstact class can be useful to call from a constructor
    // from an inheriting non-abstract class to set private instance variables.
    public Airplane() {

    }

    // NO error cause it is valid code.
    // A method in an abstrac class can be userfull because it is inherited by
    // subclasses.
    public void takeOff() {
	System.out.println("Woooosh!");
    }
}
