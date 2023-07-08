
// Arrays binarysearch
import java.util.Arrays;
public class Example_04 {
	public static void main(String[] args){
		String[] text = {"love","is","in","the","air"};
		int search = Arrays.binarySearch(text,"is");
		System.out.println(search);
		Arrays.sort(text);
		search = Arrays.binarySearch(text,"is");
		System.out.println(search);

	}
}

/*
	Arrays: 
	fixed size
	hold both primitive and reference type objects
	homogeneous elements
	no underlying datastructure

	Collections:
	variable size
	cannont contain primitive type object
	hetrogeneous elements
	datastructure based design
*/