import java.util.Scanner;
public class Main1{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for (int i=0;i<a;i++) {
			int b=in.nextInt();
			long sum=1;
			int model=1000000007;
			long c=3;
			while (b>0) {
				if (b%2==1)
					sum =(sum * c)% model;
				b/=2;
				c=(c*c) % model;
			}
			if (sum==0) 
				sum=1000000006;
			else
				sum=sum-1;
			System.out.println(sum);	
		}
	}
}
