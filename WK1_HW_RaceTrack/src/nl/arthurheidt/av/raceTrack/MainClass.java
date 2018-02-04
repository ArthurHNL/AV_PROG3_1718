package nl.arthurheidt.av.raceTrack;

public class MainClass {

    public static void main(String[] args) {
	RaceTrack rt = new RaceTrack();
	rt.addKart(new fastKart(7, "flaming red"));
	rt.addKart(new fastKart(3, "sunburst yellow"));
	rt.addKart(new Kart(2));
	rt.addKart(new HeavyKart(12, "girly pink"));
	
	rt.race();
    }

}
