import java.util.Scanner;

public class TriangleSides {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please Enter The Length Of Each Side Of Your Triangle: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("Your Three Sides Are: A: " + a + " B: " + b + " C: " + c);
		int s = (a + b + c) / 2;
		System.out.println(s);
		int area =(s * (s - a) * (s - b) * (s - c));
		double truarea = Math.sqrt(area);
		System.out.println(truarea);
	}

}
