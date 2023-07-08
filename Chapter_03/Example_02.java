
// Class & object 
// Private & public
class Computer {
	// Variables
	private double cpuSpeed; 	// in GHz
	// Constructor
	Computer(){
		cpuSpeed = 0;
	}
	// Methods
	void setCpuSpeed (double _cpuSpeed){
		cpuSpeed = _cpuSpeed;
	}
	double getCpuSpeed(){
		return cpuSpeed;
	}
}
public class Example_02{
	public static void main(String[] args){
		Computer myPC = new Computer();
		myPC.setCpuSpeed(4.5);
		System.out.println(myPC.getCpuSpeed());
		Computer myPC2 = new Computer();
		myPC.setCpuSpeed(5.5);
		System.out.println(myPC.cpuSpeed);	// Error

	}
}

/*
	default: public
	double cpuSpeed 
	myPC.setCpuSpeed(4.5); // allowed
	myPC.cpuSpeed = 4.5;   // allowed

	change default: private
	private double cpuSpeed
	myPC.setCpuSpeed(4.5);  // allowed
	myPC.cpuSpeed = 4.5;    // error
*/