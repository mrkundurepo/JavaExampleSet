// Iterating through collections - list

import java.util.*;
public class Example_14{
	public static void main(String[] args){
		List array = new ArrayList();
		array.add(5);
		array.add(2);
		array.add(37);
		Iterator  iterator = array.iterator();
		while (iterator.hasNext()){
			// point to next element
			int i = (Integer) iterator.next();
			// print elements
			System.out.println(i + " ");
		}
	}	
}