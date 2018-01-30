/**
 * An animal to put in a zoo.
 * 
 * @author Arthur Heidt
 *
 */
public abstract class Animal {
	private String name;
	private String eatingNoise;

	/**
	 * Default Animal constructor
	 * 
	 * @param name
	 *            name of the Animal
	 * @param eatingNoise
	 *            eating sound of the Animal.
	 * @throws IllegalArgumentException
	 *             thrown if either one of the arguments is null or invalid.
	 */
	public Animal(String name, String eatingNoise) throws IllegalArgumentException {
		if (name == null || eatingNoise == null || name.isEmpty() || eatingNoise.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.eatingNoise = eatingNoise;
	}

	/**
	 * Let the Animal eat.
	 */
	public void eat() {
		System.out.println(name + ": " + eatingNoise);
	}

}
