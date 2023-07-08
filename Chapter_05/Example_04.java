// NullPointerExceptions 
public class Example_04{
	public static void main(String[] args){
		String vehicleType = null;
		String vehicle = "car";
		if(vehicle.equals(vehicleType)){
			System.out.println("It's a car");
		} else {
			System.out.println("It's not a car");
		}
		if(vehicleType.equals(vehicle)){
			System.out.println("It's a car");
		} else {
			System.out.println("It's not a car");
		}
	}
}