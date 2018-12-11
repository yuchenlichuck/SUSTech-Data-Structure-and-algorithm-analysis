import java.util.Scanner;

public class Main52 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		for (int i = 0; i < k; i++) {
			for (int j = 1; j < n-i; j++) {
				if(a[j-1]>a[j]) {
					int tem=a[j-1];
					a[j-1]=a[j];
					a[j]=tem;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
