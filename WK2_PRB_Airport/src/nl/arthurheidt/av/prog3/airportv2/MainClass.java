package nl.arthurheidt.av.prog3.airportv2;

public class MainClass {

    public static void main(String[] args) {
	Airport schiphol = new Airport();
	
	TransportPlane tp_1 = new TransportPlane(3000, 2000, 1000);
	tp_1.board(500);
	
	TransportPlane tp_2 = new TransportPlane(1720, 1980, 1500);
	tp_1.board(750);
	
	CargoPlane cp_1 = new CargoPlane("Chinese cheapass gadgets", 3039, 2583, 10000);
	
	CargoPlane cp_2 = new CargoPlane("Fruit", 8800, 7200, 12000);
	
	StealthPlane sp = new StealthPlane();
	
	schiphol.addPlanes(tp_1, tp_2, cp_1, cp_2, sp);
	schiphol.showAllContents();
	

    }

}
