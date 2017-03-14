/*
 * Tyler Patterson
 * Mr. Nicholes
 * Csc110
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class InstanceAndClassMethods {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	static BufferedReader scann = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		System.out.println("Compute The Perimetre of A Right Triangle.");
		System.out.print("Entre Side A: ");
		int a = scan.nextInt();
		System.out.print("Entre Side B: ");
		int b = scan.nextInt();
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double p = a + b + c;
		System.out.println("The Hypotenuse Is: " + c);
		System.out.println("The Perimetre Is: " + p);
		System.out.println();
		
		System.out.print("Entre A Message: ");
		String message = scann.readLine();
		System.out.println("The Message Length Is: " + message.length());
		int n = rand.nextInt(message.length());
		System.out.print("The First " + n + " Characters of The Message Are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(message.charAt(i));
		}
		System.out.println();
		char A = (char) (rand.nextInt(90 - 65) + 65);
		char E = (char) (rand.nextInt(122 - 97) + 97);
		System.out.println("A Will Be Replaced With " + A + ".");
		System.out.println("E Will Be Replaced With " + E + ".");
		System.out.println("The New Message Is: ");
		String newMessage = message;
		for (int i = 0; i < message.length(); i++) {
			if(message.charAt(i) == 'a' || message.charAt(i) == 'A') {
				if (message.charAt(i) == 'a') {
					newMessage = message.replace('a', A);					
				} else if (message.charAt(i) == 'A') {
					newMessage = message.replace('A', A);
				}
				System.out.print(newMessage.charAt(i));
			} else if(message.charAt(i) == 'e' || message.charAt(i) == 'E') {
				if (message.charAt(i) == 'e') {
					newMessage = message.replace('e', E);					
				} else if (message.charAt(i) == 'E') {
					newMessage = message.replace('E', E);
				}
				System.out.print(newMessage.charAt(i));
			} else {
				System.out.print(message.charAt(i));
			}
		}
	}

}
