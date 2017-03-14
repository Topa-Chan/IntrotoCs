/*
 * Tyler Patterson
 * 6 March 2017
 */

import java.util.Scanner;

public class PP10 {

	static Scanner scan = new Scanner(System.in);
	static int[] numbers = new int[10];
	static int x = 0;
	static boolean valid = false;

	public static void main(String[] args) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		do {
			
			System.out.print("Entre A Number: ");
			try {
				numbers[x] = Integer.parseInt(scan.next());
				x++;
				if (x == 10) {
					valid = true;
				} else {
					valid = false;
				}
			} catch (NumberFormatException exception) {
				System.out.println("Please Entre A Number");
				valid = false;
			}
			
		} while (!valid);
		
		float sum = 0;
		x = 0;
		for (int s = 0; s < numbers.length; s++) {
			sum += numbers[x];
			x++;
		}
		
		float avg = sum /10;
		
		System.out.println(avg);
		
	}

}
