import java.util.Scanner;

public class Kennel {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[]args) {
		
		Dog stevie = new Dog("Stevie", 3);

		System.out.println(stevie);

		Dog todd = new Dog("Todd", 10);
		
		System.out.println(todd);
		
		Dog copper = new Dog("Copper", 11);
		
		System.out.println(copper);
		
	}
}
