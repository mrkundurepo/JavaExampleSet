
// Nested If statement
public class Example_03{
	public static void main(String[] args){
		int speed  = 75;
		int maxSpeed = 60;
		int speedForFine = 70;
		if (speed <= maxSpeed){
			System.out.println("Speed is less than or equal to the max speed limit");
			if (speed < maxSpeed){
				System.out.println("Speed is less than the max speed limit.");
			}
		}
		if (speed >= maxSpeed){
			System.out.println("Speed is more than or equal to the max speed limit");
			if (speed >  maxSpeed){
				System.out.println("You're over the speed limit.");
			}
			if (speed > speedForFine){
				System.out.println("You are eligible for a fine!");
			}

		}
	}
}