package nl.arthurheidt.av.prog3_1718.hw.wk1.zoo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 
 * @author Arthur Heidt
 *
 * A zoo to put Animals in. They can eat.
 *
 */
public class Zoo {
	private ArrayList<Animal> animals;
	
	/**
	 * Create a new, empty Zoo.
	 */
	public Zoo() {
		animals = new ArrayList<Animal>();
	}
	
	/**
	 * Create a new Zoo and add the Animals inside the referenced Collection to the zoo.
	 * @param animals Collection of Animals to add to the Zoo.
	 */
	public Zoo(Collection<Animal> animals) {
		this();
		this.animals.addAll(animals);
	}
	
	/**
	 * Create a new Zoo and add the specified Animals.
	 * @param animals Animals to add to the zoo.
	 */
	public Zoo(Animal...animals) {
		this();
		this.animals.addAll(Arrays.asList(animals));
	}
	
	/**
	 * Add a single Animal to the Zoo.
	 * @param a Animal to add to the Zoo.
	 */
	public void add(Animal a) {
		animals.add(a);
	}
	
	/**
	 * Add all specified Animals to the zoo.
	 * @param a Animals to be added to the zoo.
	 */
	public void addAll(Animal...a) {
		animals.addAll(Arrays.asList(a));
	}
	
	/**
	 * Add all the Animals from a specified collection to the Zoo.
	 * @param a Collection which Animals in it should be added to the Zoo.
	 */
	public void addAll(Collection<Animal> a) {
		animals.addAll(a);
	}
	
	/**
	 * Feed the animals.
	 */
	public void feed() {
		for (Animal a : animals) {
			if (a != null) {
				a.eat();
			} else {
				System.out.println("FOUND NULL!");
			}
		}
	}

}
