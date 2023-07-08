
// Method-local inner classes
class Container {
	int c = 17;
	public void print(){
		System.out.println("This is an outer class");
	}
}
class Example_16{
	public static void main(String[] args){
		//inner class
		Container container = new Container(){
			@Override
			public void print(){
				System.out.println("This is an inner class"); // This will print
			}
		};
		container.print();
		System.out.println(container.c);

	}
}