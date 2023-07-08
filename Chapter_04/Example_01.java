
// Arrays tostring sort
import java.util.Arrays;
public class Example_01 {
	public static void main(String[] args){
		String[] text = new String[] {"Spam","More","Buy"};
		Arrays.sort(text);
		System.out.println(Arrays.toString(text));
		for(int i=0; i<text.length; i++){
			System.out.println(text[i] + " ");
		}
	}
}


/*
	Collections, Lists, and Java's Build-In API

	Set: A collection that contains no duplicates
	List: An ordered collection or sequence, allowing for duplicates
	Queue: FIFO A collection that sorts data in the order of its arrival 
	Deque: FIFO LIFO A queue that allows for data insertion at both ends
	Map: Relates keys – which must be unique – to values
	Stack: LIFO
*/