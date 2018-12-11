package speed;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("qinghau");  
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
	    int c = (int) ((Math.floor(a/5))*5);
	    int d = (int) ((Math.ceil(b/5))*5);
	    while (c<=d) {
	    double v = c/3.6;
		System.out.printf("<speed in %.2fkm/h> "+"<b.d.=%.2fm on wet road> "+"<b.d=%.2fm on dry road>", c,(v+0.5*v*v/0.4/9.8),(v+0.5*v*v/0.7/9.8));
	    c = c+5;
	         }
	    }
}
