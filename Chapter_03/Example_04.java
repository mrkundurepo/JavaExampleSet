
// Inheritance in Java
class Computer {
	// variable 
	private double cpuSpeed; 	// in GHz
	// constructor
	Computer(){
		cpuSpeed = 0.0;
	}
	// methods
	void setCpuSpeed(double _cpuSpeed){
		cpuSpeed = _cpuSpeed;
	}
	double getCpuSpeed(){
		return cpuSpeed;
	}
}
// Inheriting
class Tablet extends Computer {
	// variable
	private double screenSize; 	// in inches
	// methods
	void setScreenSize (double _screeSize){
		screenSize = _screeSize;
	}
	double getScreenSize(){
		return screenSize;
	}
}
// Main class
public class Example_04{
	public static void main(String[] args){
		Tablet myTab = new Tablet();
		myTab.setCpuSpeed(2.5);
		myTab.setScreenSize(10);
		System.out.println(myTab.getCpuSpeed());
		System.out.println(myTab.getScreenSize());
	}
}