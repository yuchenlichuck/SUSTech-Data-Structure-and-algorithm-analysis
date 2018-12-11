package src;

import java.util.Scanner;

public class Bakhshali2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double s = in.nextDouble();
		if (s < 0) {
			System.out.print("error");
		} else {
			double a = 0;
			double b = 0;
			int x0 = 0;
			double x1 = 0;
			double x2 = 0;
			if (s == 0) {
				System.out.println("x0 = " + 0);
				System.out.printf("x1 = %6f", s);
				System.out.println();
				System.out.printf("x2 = %6f\r\n", s);
				System.out.printf("Library: %6f", Math.sqrt(s));
			} else if (s < 1) {
				a = (s - s * s) / (2 * s);
				b = s + a;
				x1 = b - a * a / (2 * b);
				System.out.println("x0 = " + 0);
				System.out.printf("x1 = %6f\r\n", x1);
				a = (s - x1 * x1) / (2 * x1);
				b = x1 + a;
				x2 = b - a * a / (2 * b);
				System.out.printf("x2 = %6f", x2);
				System.out.println();
				System.out.printf("Library: %6f", Math.sqrt(s));
			} 
			else {
				int i = 0;
				while (i * i <= s || (i + 1) * (i + 1) < s)
					i++;
				x0 = i - 1;
				a = (s - x0 * x0) / (2 * x0);
				b = x0 + a;
				x1 = b - a * a / (2 * b);
				System.out.println("x0 = " + x0);
				System.out.printf("x1 = %6f\r\n", x1);
				a = (s - x1 * x1) / (2 * x1);
				b = x1 + a;
				x2 = b - a * a / (2 * b);
				System.out.printf("x2 = %6f", x2);
				System.out.println();
				System.out.printf("Library: %6f", Math.sqrt(s));
			}
		}
	}
}