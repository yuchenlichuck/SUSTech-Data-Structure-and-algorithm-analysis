package demo;

import java.util.Scanner;

public class ScannerTester {
	
	public static void Main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s2 = in.next();
		double d = in.nextDouble();
		float f = in.nextFloat();
		int i = in.nextInt();
		System.out.println(d+" "+f+" "+i+" "+s+" "+s2);
	}
	
}
