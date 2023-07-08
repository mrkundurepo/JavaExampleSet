// Catch exception
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Example_07{
	public static void main(String[] args){
		// declare a list that will contain all of the files
		// inside of the readme.txt file
		List<String> lines = Collections.emptyList();
		try{
			// provole an exception
			lines = Files.readAllLines(Paths.get("readme.txt"));
		} catch (NoSuchFileException fe){
			System.out.println("Exception: File not Found");
			fe.printStackTrace();
		} catch (IOException ioe){
			System.out.println("Exception: IOException");
		}
		// you will never see this print
		Iterator<String> iterator = lines.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}