
// Collection: set - hashset
import java.util.*;
public class Example_05 {
	public static void main(String[] args){
		Integer[] myArray = new Integer[]{3,25,2,79,2};
		Set mySet = new HashSet(Arrays.asList(myArray));
		System.out.println(mySet);

		Set mySet1 = new HashSet();
		Collections.addAll (mySet1,myArray);
		System.out.println(mySet1);

		String[] myArray2 = new String[]{"3","25","2","79","2"};
		Set mySet2 = new HashSet();
		Collections.addAll (mySet2,myArray2);
		System.out.println(mySet2);
	}
}

// Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(myArray));
