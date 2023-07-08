
// Collection - linkedhashset
import java.util.*;
public class Example_09{
	public static void main(String[] args){
		Set set1 = new LinkedHashSet();
		set1.add(35);
		set1.add(19);
		set1.add(11);
		set1.add(83);
		set1.add(7);
		System.out.println(set1);
		Set set2 = new LinkedHashSet();
		set2.add(3);
		set2.add(19);
		set2.add(11);
		set2.add(0);
		set2.add(7);
		System.out.println(set2);
		set1.removeAll(set2); // Difference
		System.out.println(set1);
	}
}