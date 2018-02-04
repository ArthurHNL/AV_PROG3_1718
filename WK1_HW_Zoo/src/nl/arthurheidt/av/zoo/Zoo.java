package nl.arthurheidt.av.zoo;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Animal> animals;

	public Zoo() {
		animals = new ArrayList<Animal>();
	}

	public void feedAnimals() {
		for (Animal a : animals) {
			if (a != null)
				a.eat();
		}
	}

	public void addAnimal(Animal a) {
		animals.add(a);
	}

	public void addAllAnimals(Animal... a) {
		for (Animal an : a) {
			if (an != null)
				animals.add(an);
		}
	}
	
	public void addAllAnimals(java.util.Collection<Animal> c) {
		c.removeIf(java.util.Objects::isNull);
		animals.addAll(c);
	}
}
