package nl.arthurheidt.av.prog3_1718.pr.wk1.a.simpel.cars;

public class MainClass {

    public static void main(String[] args) {
	Convertible conv = new Convertible("6-XRT-52", 5.2, true);
	conv.drive();
	conv.toggleRoof();
	System.out.println(conv.isRoofOpen());

    }

}
