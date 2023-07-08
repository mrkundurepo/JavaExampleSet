
// Avoid Overriding using Final Class and Methods

class Temperature {
	public double t = 25;
	public double getCelsius(){
		return t;
	}
	final public double getFahrenheit(){
		return t * 9/5 + 32;
	}
}
class Example_07 {
	public static void main(String[] args){
		Temperature temp = new Temperature();
		System.out.println(temp.getCelsius());
		System.out.println(temp.getFahrenheit());	
	}
}

// A "Final" class cannot be extended
// A "Final" method cannot be overridden 
// A "Final" variable cannot be changed 
