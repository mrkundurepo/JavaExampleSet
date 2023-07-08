// Exceptions 
public class Example_01{
	public static void main(String[] args){
		// declare a string with nothing inside
		String text = null;
		// you will see this at the console
		System.out.println("Go java go!");
		// null'ed strings should crash your program
		System.out.println(text.length());
		// you will never see this print
		System.out.println("Done");
	}
}

//(Compile time error is better than runtime error)
// Checked exception = compile time
// Unchecked exception = runtime 