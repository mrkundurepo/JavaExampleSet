
// Overloading methods 
class Age{
	// global scope
	public double a=0;
	public void setAge(double _a){
		// local scope
		a = _a;
	}
	public void setAge (int year, int month){
		// local scope		
		a = year + (double) month/12;	// casting types
	}
	public double getAge(){
		// local scope		
		return a;
	}
	class Example_08 {
		public static void main(String[] args){
			Age age = new Age();
			age.setAge(12.5);
			System.out.println(age.getAge());
			age.setAge(9, 3);
			System.out.println(age.getAge());
		}
	}
}


// Overloading: same name, different return data types or number of parameters
