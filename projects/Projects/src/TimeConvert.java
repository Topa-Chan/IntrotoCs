import java.util.Scanner;

public class TimeConvert {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Seconds To Convert: ");
		int Seconds = scan.nextInt();
		System.out.println("In " + Seconds + " Seconds, There Are: ");
		int Hours = Seconds/3600;
		int hour = Seconds % 3600;
		int Minutes = hour/60;
		int mins = hour % 60;
		int Second = mins;
		System.out.println(Hours + " Hours");
		System.out.println(Minutes + " Minutes");
		System.out.println(Second + " Seconds");
		
	}

}