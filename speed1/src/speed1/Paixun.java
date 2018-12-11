package speed1;
import java.sql.Driver;
import java.util.Arrays;
import java.util.Scanner;

public class Paixun {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
				int sp = in.nextInt();
				double a[]= new double[sp];
				for (int i=0;i<sp;i++) {

					 a[i]=in.nextDouble();
				}
				double b=0;
				b=a[sp-1];
				a[sp-1]=a[0];
				a[0]=b;
				double se=0;
				for (int i =0; i < sp;i++) {
					se = se+a[i];}
				double e=se/sp;
				System.out.printf("%2f",e);
//				System.out.println(Arrays.toString(a));
				Arrays.sort(a);
				}
}
