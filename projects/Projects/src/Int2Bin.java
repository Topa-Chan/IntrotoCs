import java.util.Scanner;

public class Int2Bin {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a Number From 0 To 255: ");
		int Number = scan.nextInt();
		//128, 64, 32, 16, 8, 4, 2, 1..
		int TwoToSeven = Number / 128;
		int RemainSeven = Number % 128;
		int TwoToSix = RemainSeven / 64;
		int RemainSix = TwoToSix % 64;
		int TwoToFive = RemainSix / 32;
		int RemainFive = TwoToFive % 32;
		int TwoToFour = RemainFive / 16;
		int RemainFour = TwoToFour % 16;
		int TwoToThree = RemainFour / 8;
		int RemainThree = TwoToThree % 8;
		int TwoToTwo = RemainThree / 4;
		int RemainTwo = TwoToTwo % 4;
		int TwoToOne = RemainTwo / 2;
		int RemainOne = TwoToOne % 2;
		int TwoToZero = RemainOne / 1;
		System.out.println(Number + " Converted To Binary Is " + TwoToSeven + TwoToSix + TwoToFive + TwoToFour + TwoToThree + TwoToTwo + TwoToOne + TwoToZero);
	}

}
