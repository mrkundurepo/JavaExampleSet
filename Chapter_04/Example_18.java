// Properties
import java.util.*;
public class Example_18{
	public static void main(String[] args){
		Properties properties = new Properties();
		Set setOfKeys;
		String key;

		properties.put("OS","Liunx");
		properties.put("version","18.04");
		properties.put("language","English(UK)");

		// iterate through the map
		setOfKeys = properties.keySet();
		Iterator iterator = setOfKeys.iterator();
		while(iterator.hasNext()){
			key = (String) iterator.next();
			System.out.println(key + " = " + properties.getProperty(key));
		}
		System.out.println();
		// looking for URL that not in list
		String value = properties.getProperty("Keyboard layout", "not found");
		System.out.println("Keyboard layout = " + value);
	}
}

// used to maintain lists of key-value 
// pairs where both are of the String class.