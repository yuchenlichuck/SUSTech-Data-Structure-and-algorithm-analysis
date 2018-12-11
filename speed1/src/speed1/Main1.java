package speed1;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
	    int c1 = (int) (Math.floor(a/5));
	    int d1 = (int) (Math.ceil(b/5));
	    double c=5*c1;
	    double d=5*d1;
	    while (c<=d) {
	    double v = c/3.6;
	    double v1 =(v+0.5*v*v/0.4/9.8);
	    double v2 =(v+0.5*v*v/0.7/9.8);
		System.out.printf("<speed in %.0fkm/h> "+"<b.d.=%.2fm on wet road> "+"<b.d=%.2fm on dry road>", c,v1,v2);
		System.out.println();
		c = c+5;
	         }
	    }
}