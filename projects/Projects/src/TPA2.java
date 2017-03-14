import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/*Tyler Patterson
 * Todd Nicholes
 * CSC110
 */

public class TPA2 {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	static DecimalFormat fmt = new DecimalFormat("0.###");

	public static void main(String[] args) {
		System.out.print("Please Enter A Message: ");
		String Message = scan.next();
		int messageNum = rand.nextInt(Message.length());
		System.out.println("The Randomly Selected Character At Position " + messageNum + " Is " + Message.charAt(messageNum) + "." );
		System.out.println();
		System.out.print("Please Enter A Number: ");
		double firstNum = scan.nextDouble();
		System.out.print("Please Enter Another Number: ");
		double secondNum = scan.nextDouble();
		double Powered = Math.pow(firstNum, secondNum);
		System.out.println(Powered);
		System.out.println(firstNum + " Raised To The Power Of " + secondNum + " Is " + fmt.format(Powered) + ".");
		double absPowered = Math.abs(Powered);
		System.out.println("The Absolute Value Of " + fmt.format(Powered) + " Is " + fmt.format(absPowered) + ".");
	}

}
