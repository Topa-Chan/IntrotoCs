import java.util.Scanner;
import java.io.*;

public class MyFruit {
	
	public static void main(String[] args) throws IOException {
		
		String fruit;
		Scanner fileScan, urlScan; 
		
		fileScan = new Scanner(new File("Fruit.txt"));
		
		while (fileScan.hasNext())
		{
			fruit = fileScan.nextLine();
			System.out.println(fruit);
			
			urlScan = new Scanner(fruit);
			urlScan.useDelimiter(":");
			
			while (urlScan.hasNext())
				System.out.println(" " + urlScan.next());
			System.out.println();
		}
		
	}

}
