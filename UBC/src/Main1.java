import java.util.Scanner;

public class Main1 {
	public static int con(int m , int n) {
		if (m<n)
			return 0;
		int k=1;
		int j=1;
		for (int i=n;i>=1;i--) {
			k*=m;
			j*=n;
			m--;
			n--;
		}
		return k/j;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a=n / 2;
		int b=n / 3;
		int sum=0;
		for(int i=0;i<=b;i+=1) {
			int num=n;
			num-=3*i;
			if (num % 2==1) {continue;}
			if (num % 2==0) {sum+=con(i+(num /2 ),i);}				
			}
	System.out.print(sum);	
	
	}
		
	}
	
	

