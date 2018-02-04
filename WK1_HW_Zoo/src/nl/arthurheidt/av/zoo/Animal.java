package nl.arthurheidt.av.zoo;

public class Animal {
	private String name;
	private String eatingNoise;

	public Animal(String name, String eatingNoise) {
		this.name = name;
		this.eatingNoise = eatingNoise;
	}

	public void eat() {
		System.out.println("[" + this.getClass().getSimpleName() + " " + name + "] " + eatingNoise);
	}

}
