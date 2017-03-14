import java.util.Scanner;

public class Farm {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Farm myFarm = new Farm();
		myFarm.run();
		
	}
	
	private void run() {
		
		boolean valid = false;
		Animal[] animals = new Animal[10];
		
		int x = 0;
		do {
			System.out.print("Would You Like To Enter An Animal? (y/n): ");
			String answer = scan.next();
			if (answer.equals("y")) {
				System.out.println("Which Type Of Animal Would You Like To Add?");
				System.out.println("1. Pig");
				System.out.println("2. Cow");
				System.out.println("3. Horse");
				System.out.println("4. Emu");
				System.out.print("Please Enter A Number: ");
				int choice = scan.nextInt();
				System.out.print("Please Enter A Name: ");
				String name = scan.next();
				
				animals[x++] = new Animal(Animal.TYPE.Cow, name);
				
			} else if (answer.equals("n")) {
				System.out.println("Okay.");
				valid = true;
			}	
		} while(!valid);
		
		System.out.println("My Farm");
		for(Animal animal : animals) {
			if (animal != null)
				System.out.println(animal);
		}
	}
	
}
