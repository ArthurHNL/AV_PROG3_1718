package nl.arthurheidt.av.prog3.airport;

public class MainClass {

    public static void main(String[] args) {
	// Airplane plane = new Airplane(); NOT ALLOWED cause Airplane is abstract.
	CargoPlane airplane = new CargoPlane("Flowers");
	Airport schiphol = new Airport();
	schiphol.addPlane(airplane);
	CargoPlane cp = (CargoPlane) (schiphol.getPlane(0));
	cp.showCargo();
	// The output in the console is expected, because it is the result of the
	// showCargo method called from the cargoplane.
	System.out.println();
	System.out.println();
	CargoPlane ap2 = new CargoPlane("Furniture");
	schiphol.addPlane(ap2);
	TransportPlane tp1 = new TransportPlane();
	tp1.board(200);
	schiphol.addPlane(tp1);
	TransportPlane tp2 = new TransportPlane();
	tp2.board(150);
	schiphol.addPlane(tp2);
	schiphol.showAllContents();

    }

}
