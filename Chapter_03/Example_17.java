
// Anonymous inner class
class Container{
	int c = 17;
	public void print(){
		System.out.println("This is an outer class");
	}
}
public class Example_17{
	public static void main(String[] args){
		// inner class
		Container container = new Containers(){
			@Override
			public void print(){
				System.out.println("This is an inner class");
			}
		};
		container.print();
		System.out.println(container.c);
	}
}