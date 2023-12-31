
// Collections - map
import java.util.*;
public class Example_13{
	public static void main(String[] args){
		Map map = new HashMap();
		map.put("number", new Integer(1));
		map.put("text", new String("hola"));
		map.put("decimal", new Double(5.7));
		System.out.println(map.get("text"));
		if(!map.containsKey("byte")){
			System.out.println("There are no bytes here!");
		}
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
	}
}

/*
	key must be unique
	hashmap, treemap, linkedhashmap

	put(Object Key, Object value)
	putAll(Map map)
	remove(Object key)
	get(Object key)
	containsKey(Object Key)
	keySet()
	entrySet()
*/