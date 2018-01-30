package nl.arthurheidt.av.prog3_1718.hw.zoo;

/**
 * A bear to put in a zoo.
 * @author Arthur Heidt
 *
 */
public class Bear extends Animal {
	
	/**
	 * Create a new bear
	 * @param name name of the frog.
	 * @throws IllegalArgumentException if the name is empty
	 */
	public Bear(String name) throws IllegalArgumentException {
		super(name, "ROAR!");
	}
}
