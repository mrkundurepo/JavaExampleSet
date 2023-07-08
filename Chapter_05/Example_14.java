// Handle exception
public class Example_14{
	public static void main(String[] args){
		String text = null;
		try{
			System.out.println(text.length());
		} catch (Exception e){
			System.out.println("Exception happened");
		}
	}
}