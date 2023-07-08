// Exception
public class Example_05{
	private static void staticMethod(){
		System.out.println("Static method, accessible from null reference");
	}
	private void nonStaticMethod(){
		System.out.println("non-static method, inaccessible from null reference");
	}
	public static void main(String[] args){
		Example_05 object = null;
		object.staticMethod();
		// object.nonStaticMethod();
	}
}	