/**
 * A pig to put in a zoo.
 * @author Arthur Heidt
 *
 */
public class Pig extends Animal {
	
	/**
	 * Create a new pig
	 * @param name name of the frog.
	 * @throws IllegalArgumentException if the name is empty
	 */
	public Pig(String name) throws IllegalArgumentException {
		super(name, "Oink Oink");
	}

}
