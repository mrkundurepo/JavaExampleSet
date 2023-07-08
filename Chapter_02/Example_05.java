
// Logical Operators and Conditionals
public class Example_05{
	public static void main(String[] args){
		boolean red = true;
		boolean blue = true;
		if ((red) && (blue)){
			System.out.println("Both red AND blue are true");
		}
		blue = false;
		if ((red)|| (blue)){
			System.out.println("Either red OR blue OR both are true.");
		}
		if (!blue){
			System.out.println("The variable blue is false");
		}

		/*
		a&&b=true when a=true and b=true
		a||b=true when a=true or b=true or both
		!a=ture when a=false
		*/
	}
}