package nl.arthurheidt.av.prog3.flatpartyV2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHandler {
    final static Charset ENCODING = StandardCharsets.UTF_8;

    List<String> readSmallTextFile(String aFileName) {
	Path path = Paths.get(aFileName);
	try {
	    return Files.readAllLines(path, ENCODING);
	} catch (IOException iox) {
	    return null;
	}
    }
    void writeSmallTextFile(List<String> lines, String fileName) {
	Path p = Paths.get(fileName);
	try {
	    Files.write(p, lines, ENCODING);
	} catch (IOException e) {
	    System.out.println("Something went wrong writing to the output!");
	}
    }
}
