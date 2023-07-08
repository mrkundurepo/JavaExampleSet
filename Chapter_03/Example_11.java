
// Annotations @Override
class Computer{
	public void whatIsIt(){
		System.out.println("It is a PC");
	}
}
class Tablet extends Computer {
	@Override
	public void whatIsIt(){
		System.out.println("It is a tablet");
	}
}
class Example_11{
	public static void main (String[] args){
		Tablet myTab = new Tablet();
		myTab.whatIsIt();
	} 
}
// annotations are metadata that inform compiler about relevant aspects of code.
// used during the declaration of classes, fields, methods, variables and parameters
