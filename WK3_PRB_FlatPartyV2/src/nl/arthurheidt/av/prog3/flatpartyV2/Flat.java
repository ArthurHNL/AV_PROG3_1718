package nl.arthurheidt.av.prog3.flatpartyV2;

import java.util.List;
import java.util.ArrayList;

public class Flat {
    private ArrayList<Apartment> ap;

    public Flat(List<Integer> apartments) {
	ap = new ArrayList<Apartment>();
	for (int i : apartments) {
	    ap.add(new Apartment(i));
	}
    }

    public void drawFlat() {
	System.out.println("/---\\");
	for (Apartment a : ap) {
	    if (a != null) {
		a.print();
	    }
	}
    }
    public List<String> getPrintLines(){
	ArrayList<String> output = new ArrayList<String>();
	output.add("/---\\");
	for (Apartment a : ap) {
	    if (a != null) {
		output.add(a.getPrintLine());
	    }
	}
	return output;
	
    }
}
