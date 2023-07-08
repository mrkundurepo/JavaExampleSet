
// Comparing strings
public class Example_10 {
	public static void main(String[] args){
		String cat = new String("cat");
		String dog = new String("dog");
		if (cat.equals(dog)){
			System.out.println("Cats and dogs are the same.");
		}
		if (!cat.equals(dog)){
			System.out.println("Cats and dogs are not the same.");
		}
		if (dog.equals(dog)){
			System.out.println("Dogs are dogs1.");
		}
		// Using literal strings
		if (dog.equals("dog")){
			System.out.println("Dogs are dogs2.");
		}
		// Can compare using literal strings
		if ("dog".equals(dog)){
			System.out.println("Dogs are dogs3.");
		}

	}
}