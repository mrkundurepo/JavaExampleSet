
// Properties 
import java.util.*;
public class Example_19{
	public static void main(String[] args){
		Properties properties = new Properties();

		properties.put("OS","Liunx");
		properties.put("version","18.04");
		properties.put("language","English(UK)");

		// System.out
		properties.list(System.out);

		// propertyNames return Enum
		Enumeration enumeration = properties.propertyName();
		while (enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}

		String oldValue = (String) properties.setProperty("language","German");
		if(oldValue != null){
			System.out.println("modified the language property");
		}
		properties.list(System.out);
	}
}