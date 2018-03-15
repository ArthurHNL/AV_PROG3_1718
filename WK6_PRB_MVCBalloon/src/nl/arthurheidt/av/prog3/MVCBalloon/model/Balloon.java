package nl.arthurheidt.av.prog3.MVCBalloon.model;
import nl.arthurheidt.av.prog3.MVCBalloon.controller.BalloonExplodedException;

public class Balloon {
    private int size = 0;
    public final static int MAX_BALLOON_SIZE = 9;
    public int getSize() {
	return size;
    }
    public void pump() throws BalloonExplodedException {
	size++;
	if (size > MAX_BALLOON_SIZE) {
	    throw new BalloonExplodedException();
	}
    }
}
