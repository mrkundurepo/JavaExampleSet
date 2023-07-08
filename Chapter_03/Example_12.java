
// Annotations @Depricated
class Computer{
	@Deprecated
	public void whatIsIt(){
		System.out.println("It is a PC");
	}
	public void getDeviceType(){
		System.out.println("It is a PC");
	}
}
class Tablet extends Computer {
	@Override
	public void whatIsIt(){
		System.out.println("It is a tablet");
	}
}
class Example_12{
	public static void main (String[] args){
		Tablet myTab = new Tablet();
		myTab.whatIsIt();
	} 
}
