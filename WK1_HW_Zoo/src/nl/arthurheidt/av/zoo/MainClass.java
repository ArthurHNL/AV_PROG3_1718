package nl.arthurheidt.av.zoo;

public class MainClass {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.addAllAnimals(new Pig("Hank"), new Bear("Bill"), new Frog("Bob"));
		z.feedAnimals();

	}

}
