package nl.arthurheidt.av.prog3.flatparty;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
	/**float a = Math.round((int)23.8);
	int b =  (int) Math.abs(23.5); //Must cast.
	double c = Math.random();
	float d = (float)Math.sqrt(-4.5);
	double e = Math.tan(3);*/
	
	int floors = 0;
	try {
	    FileHandler fh = new FileHandler();
	    List<String> list = fh.readSmallTextFile("files\\flatInfo.txt");
	    floors = Integer.parseInt(list.get(0));
	} catch (NullPointerException ex) {
	    System.out.println("Input file not found!");
	    System.exit(-1);
	} catch (NumberFormatException nex) {
	    System.out.println("Not a number!");
	    System.exit(-1);
	}
	
	Flat f = new Flat(floors);
	f.drawFlat();

    }

}
