
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sp = sc.nextDouble();
		double v=sp/3.6;
		System.out.printf("<speed in %.2fkm/h> "+"<b.d.=%.2fm on wet road> "+"<b.d=%.2fm on dry road>", sp,(v+1.5*0.5*v*v/0.7/9.8),(v+0.5*v*v/0.7/9.8));
	
	}
}