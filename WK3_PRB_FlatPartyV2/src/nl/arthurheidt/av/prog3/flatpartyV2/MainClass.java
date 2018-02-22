package nl.arthurheidt.av.prog3.flatpartyV2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
	/**float a = Math.round((int)23.8);
	int b =  (int) Math.abs(23.5); //Must cast.
	double c = Math.random();
	float d = (float)Math.sqrt(-4.5);
	double e = Math.tan(3);*/
	FileHandler fh = new FileHandler();
	ArrayList<Integer> floorNumbers = new ArrayList<Integer>();
	try {
	    List<String> list = fh.readSmallTextFile("files\\flatInfo.txt");
	    for (String s : list) {
		floorNumbers.add(Integer.parseInt(s));
	    }
	    
	} catch (NullPointerException ex) {
	    System.out.println("Input file not found!");
	    System.exit(-1);
	} catch (NumberFormatException nex) {
	    System.out.println("Not a number!");
	    System.exit(-1);
	}
	
	Flat f = new Flat(floorNumbers);
	f.drawFlat();
	fh.writeSmallTextFile(f.getPrintLines(), "files\\flatVisual.txt");

    }

}
