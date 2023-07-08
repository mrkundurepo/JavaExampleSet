
// Checking the Precedence of a Class with instanceof
public class Example_03{
	public static void checkNumber(Number val){
		if(val instanceof Integer){
			System.out.println("It is an Integer");
		}
		if(val instanceof Double){
			System.out.println("It is an Double");
		}
	}
	public static void main(String[] args){
		int val1 = 3;
		double val2 = 2.7;
		checkNumber(val1);
		checkNumber(val2);
	}
}

// instanceof = check whether an object is an instance of a specific class.
