package demo;

import java.util.Scanner;

public class Mainpp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d = in.nextDouble();
		double  b = d;
		int a=(int)d;
		a /= 10;
		double c = 0;
		if (a ==10) System.out.println("Your grade is 100.0, the cooresponding GPA is 4.0  ");
		
		else {switch (a) {
		case 9: c =  4.0;break;
		case 8: c = 3.0;break;
		case 7: c = 2.0;break;
		case 6: c = 1.0;break;
		default: c= 0.0;break;
		}
		System.out.printf("Your grade is %.1f, the cooresponding GPA is %.1f",b,c);
	}

}
	}