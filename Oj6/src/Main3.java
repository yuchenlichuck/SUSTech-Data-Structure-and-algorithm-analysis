import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++) {
		
		int n=in.nextInt();
		int[] a=new int[n];
		for (int j = 0; j < n; j++) {
			a[j]=in.nextInt();
		}
		int  sum=0;
		for(int j=0;j<n-1;j++)
		for (int k = 0; k < n-j-1; k++) {
			if (a[k]>a[k+1]) {
				int swap=a[k];
				a[k]=a[k+1];
				a[k+1]=swap;
			sum++;
			}
			
		}
		
		System.out.println(sum);
		}
	}
}
