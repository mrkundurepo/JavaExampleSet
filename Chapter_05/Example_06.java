// Catching Exception

public class Example_06 {
	public static void main(String[] args){
		// declare a string with nothing inside
		String text = null;
		// you will see this at the console
		System.out.println("Go Java Go");
		try {
			// null'ed strings should crash your program
			System.out.println(text.length());
		} catch (NullPointerException ex){
			System.out.println("Exception: cannot get the text's length");
		}
		// you will now see this print
		System.out.println("done");
	}
}


/*
	try{ // code that could generate an exception of the type ExceptionM}
	catch (ExceptionM e){// code to be executed in case of exception happening}
*/
