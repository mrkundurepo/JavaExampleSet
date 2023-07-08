
// Local Variable type inference
// var = String, int, float, double, char, boolean
public class Example_22{
	public static void main(String[] args){
		var s = new String("Hello");
		System.out.println("The value is "+s);
		var i = Integer.valueOf("42");
		System.out.println("The value is "+i);

		// var s = new String("Hello");
		// String s = new String("Hello");
	}
}