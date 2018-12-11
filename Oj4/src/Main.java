import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
			int n=in.nextInt();
			int m=in.nextInt();
			int[] a=new int[n];
			for (int j=0;j<n;j++){
			a[j]=in.nextInt();
			}
			if (n<=2) {
				System.out.println(0);
				continue;
			}
			
			BigInteger sum=new BigInteger("0");
			int um=1;			
			for(int j=0;j<n-2;j++) {
				while(a[um]-a[j]<=m && um<=n-2) 
					um++;
				if (um!=n-1)um--;
				if(um==n-1 && a[um]-a[j]>m)
					continue;
				sum=sum.add(BigInteger.valueOf((um-j)*(um-j-1 )/2));
			}
			
			System.out.println(sum);
	}
	}
	
	
}
