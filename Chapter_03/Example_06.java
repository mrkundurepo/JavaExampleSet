
// Hiding Static methods
class Computer{
	public static void whatIsIt(){
		System.out.println("It is a PC");
	}
}
class Tablet extends Computer {
	public static void whatIsIt(){
		System.out.println("It is a Tablet");
	}
}
class Example_05 {
	public static void main(String[] args){
		Tablet myTab = new Tablet();
		myTab.whatIsIt();
		Computer myTab2 = new Tablet();
		myTab2.whatIsIt();
		Tablet.whatIsIt();
		Computer myTab3 = new Computer();
		myTab3.whatIsIt();
	}
}