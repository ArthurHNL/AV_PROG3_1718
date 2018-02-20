package nl.arthurheidt.av.prog3.flatparty;

public class Flat {
    private Apartment[] ap;
    
    public Flat(int floors) {
	ap = new Apartment[floors];
	for (int i = 0; i < ap.length; i++) {
	    ap[i] = new Apartment(i);
	}
    }
    public void drawFlat() {
	System.out.println("/---\\");
	for (int i = (ap.length - 1); i >= 0; i--) {
	    ap[i].print();
	}
    }
}
