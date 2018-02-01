package nl.arthurheidt.av.prog3_1718.hw.wk1.zoo;

public class MainClass {

    public static void main(String[] args) {

	// Animal a = new Animal(); -> Not allowed, Animal is abstract.
	// Animal b = new Frog("Hank"); // -> Allowed, calls the Frog constructor. As
	// Frog extends Animal, a reference
	// variable to a frog can be placed in a Animal-type refrence variable.
	// Animal a;
	// Frog f = new Frog("Joe"); // -> Allowed, calls the frog constructor and
	// constructs a Frog.
	// Frog k = new Animal(); -> Not allowed, Animal is abstract.
	// f = b; -> Not allowed, the Animal might not be a frog.

	Frog a = new Frog("Joe");
	Pig b = new Pig("Joe");
	Bear c = new Bear("Bill");

	Zoo z = new Zoo(a, b, c);
	z.feed();

    }

}
