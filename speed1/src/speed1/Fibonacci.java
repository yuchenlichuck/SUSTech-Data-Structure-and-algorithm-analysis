package speed1;

import java.util.Scanner;

public class Fibonacci {
		public static void main(String[] args) { 
			Scanner in = new Scanner(System.in);
	        int a = in.nextInt();int i=0;
	        for (i=0;i<a;i++) {
		        int b=in.nextInt();int sum=0;int c2=2;
		        int c1=1;
		        	while (c1 <=b) {
		        	System.out.println(c1);
		        	sum = c1;
		        	c1 = c2;
		        	c2 = c2+sum;
		        	}
		        }
		}
}
