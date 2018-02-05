package nl.arthurheidt.av.prog3.airport;

public class CargoPlane extends Airplane {
    private String load;
    
    
    
    public CargoPlane(String load) {
	this.loadUp(load);
    }
    
    public void loadUp(String load) {
	this.load = load;
    }
    
    public String getCargo() {
	return load;
    }
    
    public void showCargo() {
	System.out.println(load);
    }
    
    

    // DOES create an arror because it does not make sense to have an abstract
    // method in a non-abstract class, cause the method could not be executed when
    // it is called on an instance of the class.
    // public abstract void unload();
}
