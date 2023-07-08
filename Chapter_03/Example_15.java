
// Non-static Inner classes
class Container {
	// inner class
	private class Continent {
		public void print(){
			System.out.println("This is an inner class");
		}
	}
	// method to give access to the private inner class method
	void printContinent(){
		Continent continent = new Continent();
		continent.print();
	}
} 
class Example_15{
	public static void main(String[] args){
		Container container = new Container();
		container.printContinent();
	}
}