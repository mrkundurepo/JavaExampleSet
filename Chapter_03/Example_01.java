
// Object oriented programming

class Computer{
	// variables
	double cpuSpeed;	// in GHz
	// constructor
	Computer(){
		cpuSpeed = 0;
	}
	// overlaoding constructor with parameter
	Computer(double _c){
		cpuSpeed = _c;
	}
	// no-return (void) methods
	void setCpuSpeed (double _cpuSpeed){
		cpuSpeed = _cpuSpeed;
	}
	// return methods
	double getCpuSpeed(){
		return cpuSpeed;
	}
}
public class Example_01{
	public static void main(String[] args){
		Computer myPC = new Computer();
		System.out.println(myPC.getCpuSpeed());
		myPC.setCpuSpeed(2.5);
		System.out.println(myPC.getCpuSpeed());
		Computer myPC2 = new Computer(7.9);
		System.out.println(myPC2.getCpuSpeed());

	}
}
/*
	Basic class structure:
	class <name>{
		fields;
		methods;
	}
*/
