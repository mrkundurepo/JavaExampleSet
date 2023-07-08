
// Interfaces (129)
interface Computer{
	public String getDeviceType();
	public String getSpeed();
}
class Tablet implements Computer {
	public String getDeviceType(){
		return "it is a tablet";
	}
	public String getSpeed(){
		return "1GHz";
	}
}
class Example_14{
	public static void main(String[] args){
		Tablet myTab = new Tablet();
		System.out.println(myTab.getDeviceType());
		System.out.println(myTab.getSpeed());
	}
}


// interfaces are reference types
// interfaces defines the skeleton of classes and objects but withour including the actual functionality of methods
// classes implements interfaces but do not extends them.
// interfaces have no constructors
// class can extend one class at a time
// interfaces can extend multiple interfaces at once