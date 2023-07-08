// Throw and Throws
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Example_10 {
	public static void main(String[] args) throws IOException{
		// declare a list that will contain all the files
		// instide of the readme.txt file
		List<String> lines = Collections.emptyList();
		try{
			// provoke an exception
			lines = Files.readAllLines(Paths.get("readme.txt"));
		} catch (NoSuchFileException fe){
			System.out.println("Exception: File not Found");
			fe.printStackTrace();
		}
		// you will never see this print
		Iterator<String> iterator = lines.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}