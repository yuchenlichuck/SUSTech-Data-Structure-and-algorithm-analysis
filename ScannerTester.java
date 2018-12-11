import java.util.Scanner;

public class ScannerTester {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextline();
		String s2 = in.nextLine();
		double d = in.nextDouble();
		float f = in.nextFloat();
		int i = in.nextInt();
		System.out.println(d+" "+f+" "+i+" "+s+" "+s2);
	}
	
}