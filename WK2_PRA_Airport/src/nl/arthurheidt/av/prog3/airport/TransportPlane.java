package nl.arthurheidt.av.prog3.airport;

public class TransportPlane extends Airplane {
    private int passengers;
    
    public TransportPlane() {
	passengers = 0;
    }
    
    public void sentAllPassengersHome() {
	passengers = 0;
    }
    
    public int getPassengers() {
	return passengers;
    }
    
    public void board(int amount) {
	passengers += amount;
    }
    
    public void showPassengerAmount() {
	System.out.println(passengers);
    }
}
