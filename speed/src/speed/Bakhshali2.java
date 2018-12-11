package speed;
import java.util.Scanner;

public class Bakhshali2 {
	public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	double s = in.nextDouble();
    double  a = 0;
    double  b = 0;
    int x0 = 0;
    double  x1 = 0;
	int i = 0;
	double x2=0;
	while (i*i<=s || (i+1)*(i+1)<s)
	i++;
    x0 = i-1;
    a= (s-x0*x0) / (2*x0);
    b = x0 + a ;
    x1 = b - a*a/(2*b);
    
    		if (s < 0) {System.out.print("error");}
    		else {

    			System.out.println("x0 = "+x0);
    			System.out.printf("x1 = %6f", x1);
    		    System.out.println();
    		    a= (s-x1*x1) / (2*x1);
    		    b = x1 + a ;
    		    x2 = b - a*a/(2*b);
    		    System.out.printf("x2 = %6f", x2);
    		    System.out.println();
    		    System.out.printf("Library: %6f" ,Math.sqrt(s));

    		}
	
	}
}