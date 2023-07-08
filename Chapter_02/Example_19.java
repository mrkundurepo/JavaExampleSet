
// Handle command line arguments
public class Example_19{
	public static void main(String[] args){
		for (int i=0; i<args.length; i++){
			System.out.println(i + " " + args[i]);	
		}
		/* 
		javac Example_19.java
		java Example_19 cat dog combat
		*/
	}
}