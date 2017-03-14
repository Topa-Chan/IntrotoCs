import java.util.Scanner;

public class PlanetMetrics {
	
	private static final double pi = 3.14159;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please Enter The Radius Of A Planet In Kilometres ");
		int PlanetRadius = scan.nextInt();
		double RadiusMiles = PlanetRadius * 0.621371;
		System.out.println("The Planet's Radius Is: " + RadiusMiles + " Miles Long.");
		double Circumference = 2 * pi * RadiusMiles;
		System.out.println("The Planet's Circumference Is " + Circumference + " Miles Long.");
		double SurfaceArea = 4 * pi * (RadiusMiles * RadiusMiles);
		System.out.println("The Planet's Surface Area Is " + SurfaceArea + " Square Miles.");
	}

}
